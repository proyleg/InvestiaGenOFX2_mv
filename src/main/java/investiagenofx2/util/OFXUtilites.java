/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2.util;

import investiagenofx2.model.Account;
import investiagenofx2.model.Investment;
import investiagenofx2.model.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import ofx.*;

/**
 * @author Pierre
 */
public class OFXUtilites {

    private static String currency = null;
    private static String intubid = null;

    public static SignonResponseMessageSetV1 genSignonResponseMessageSet(String dtServer, String fiInstitution) {
        SignonResponseMessageSetV1 signonResponseMessageSet = new SignonResponseMessageSetV1();
        SignonResponse signonResponse = new SignonResponse();
        signonResponse.setLANGUAGE(LanguageEnum.ENG);
        Status status = new Status();
        status.setCODE("0");
        status.setMESSAGE("SuccessfulSignOn");
        status.setSEVERITY(SeverityEnum.INFO);
        signonResponse.setSTATUS(status);
        signonResponse.setDTSERVER(dtServer);
        FinancialInstitution financialInstitution = new FinancialInstitution();
        financialInstitution.setFID(fiInstitution);
        financialInstitution.setORG(fiInstitution);
        signonResponse.setFI(financialInstitution);
        signonResponse.setINTUBID(getIntubid());
        signonResponseMessageSet.setSONRS(signonResponse);
        return signonResponseMessageSet;
    }

    public static InvestmentStatementResponseMessageSetV1 genTransacInvestmentStatementResponseMessageSet(ArrayList<Account> accounts) {
        InvestmentStatementResponseMessageSetV1 investmentStatementResponseMessageSet = new InvestmentStatementResponseMessageSetV1();
        for (Account account : accounts) {
            investmentStatementResponseMessageSet.getINVSTMTTRNRSOrINVMAILTRNRSOrINVMAILSYNCRS().add(genInvestmentStatementTransactionResponse(account));
        }
        return investmentStatementResponseMessageSet;
    }

    private static InvestmentStatementTransactionResponse genInvestmentStatementTransactionResponse(Account account) {
        InvestmentStatementTransactionResponse investmentStatementTransactionResponse = new InvestmentStatementTransactionResponse();
        investmentStatementTransactionResponse.setTRNUID("0");
        Status status = new Status();
        status.setCODE("0");
        status.setSEVERITY(SeverityEnum.INFO);
        investmentStatementTransactionResponse.setSTATUS(status);
        InvestmentStatementResponse investmentStatementResponse = new InvestmentStatementResponse();
        investmentStatementResponse.setDTASOF(account.getBalanceDate().format(Utilities.myDateFormat()) + "100000");
        investmentStatementResponse.setCURDEF(CurrencyEnum.fromValue(currency));
        InvestmentAccount investmentAccount = new InvestmentAccount();
        investmentAccount.setACCTID(account.getAccountID());
        investmentAccount.setBROKERID("le.com");
        investmentStatementResponse.setINVACCTFROM(investmentAccount);
        InvestmentTransactionList investmentTransactionList = new InvestmentTransactionList();
        investmentTransactionList.setDTSTART(account.getTransacDateLow().format(Utilities.myDateFormat()) + "100000");
        investmentTransactionList.setDTEND(account.getTransacDateHigh().format(Utilities.myDateFormat()) + "100000");

        for (Transaction transaction : account.getTransactions()) {
            switch (transaction.getType()) {
                case "Redemption":
                case "Switch Out":
                case "Transfer Out":
                    investmentTransactionList.getBUYDEBTOrBUYMFOrBUYOPT().add(genSellMutualfund(transaction));
                    break;
                case "Purchase":
                case "Switch In":
                case "Transfer In":
                    investmentTransactionList.getBUYDEBTOrBUYMFOrBUYOPT().add(genBuyMutualfund(transaction));
                    break;
                case "Distribution":
                    investmentTransactionList.getBUYDEBTOrBUYMFOrBUYOPT().add(genReinvest(transaction));
                    break;
                case "Credit":
                case "Debit":
                    investmentTransactionList.getINVBANKTRAN().add(genBankTransaction(transaction));
                    break;
                default:
                    try {
                        throw new MyOwnException("TransTypeUnsupported: " + transaction.getType().trim());
                    } catch (MyOwnException ex) {
                        Logger.getLogger(OFXUtilites.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        }
        investmentStatementResponse.setINVTRANLIST(investmentTransactionList);

        InvestmentPositionList investmentPositionList = new InvestmentPositionList();
        for (Investment investment : account.getInvestments()) {
            if (investment.getName().contains("Encaisse") || investment.getName().contains("Total")) {
                continue;
            }
            investmentPositionList.getPOSMFOrPOSSTOCKOrPOSDEBT().add(genPositionMutualfund(
                    investment.getSymbol(),
                    Float.toString(investment.getQuantity()),
                    Float.toString(investment.getLastPrice()),
                    Float.toString(investment.getQuantity() * investment.getLastPrice()),
                    account.getBalanceDate().format(Utilities.myDateFormat()) + "100000"));
        }
        investmentStatementResponse.setINVPOSLIST(investmentPositionList);

        investmentStatementTransactionResponse.setINVSTMTRS(investmentStatementResponse);
        return investmentStatementTransactionResponse;
    }

    public static SecurityListResponseMessageSetV1 genSecurityListResponseMessageSet(ArrayList<Account> accounts) {
        List<String> symbols = new ArrayList<>();
        SecurityListResponseMessageSetV1 securityListResponseMessageSet = new SecurityListResponseMessageSetV1();
        SecurityList securityList = new SecurityList();
        for (Account account : accounts) {
            for (Transaction transaction : account.getTransactions()) {
                if (!symbols.contains(transaction.getSymbol())) {
                    securityList.getMFINFOOrSTOCKINFOOrOPTINFO().add(genMutualFundInfo(transaction.getSymbol()));
                    symbols.add(transaction.getSymbol());
                }
            }
            for (Investment investment : account.getInvestments()) {
                if (!symbols.contains(investment.getSymbol()) && !investment.getName().contains("Encaisse") && !investment.getName().contains("Total")) {
                    securityList.getMFINFOOrSTOCKINFOOrOPTINFO().add(genMutualFundInfo(investment.getSymbol()));
                    symbols.add(investment.getSymbol());
                }
            }
        }
        securityListResponseMessageSet.setSECLIST(securityList);
        return securityListResponseMessageSet;
    }

    private static SellMutualFund genSellMutualfund(Transaction transaction) {
        String myFitid;
        SellMutualFund sellMutualfund = new SellMutualFund();
        InvestmentSell investmentSell = new InvestmentSell();
        InvestmentTransaction investmentTransaction = new InvestmentTransaction();
        myFitid = "100000" + transaction.getFitid() + transaction.getUnit() + transaction.getSymbol();
        investmentTransaction.setFITID("Vente" + transaction.getDate().format(Utilities.myDateFormat()) + myFitid);
        investmentTransaction.setDTTRADE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setDTSETTLE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setMEMO("Vente");
        investmentSell.setINVTRAN(investmentTransaction);
        SecurityId securityId = new SecurityId();
        securityId.setUNIQUEID(transaction.getSymbol());
        securityId.setUNIQUEIDTYPE("CUSIP");
        investmentSell.setSECID(securityId);
        investmentSell.setUNITS(transaction.getUnit());
        investmentSell.setUNITPRICE(transaction.getPrice());
        investmentSell.setTOTAL(transaction.getAmount().replace("-", ""));
        investmentSell.setSUBACCTSEC(SubAccountEnum.CASH);
        investmentSell.setSUBACCTFUND(SubAccountEnum.CASH);
        sellMutualfund.setSELLTYPE(SellTypeEnum.SELL);
        sellMutualfund.setINVSELL(investmentSell);
        return sellMutualfund;
    }

    private static BuyMutualFund genBuyMutualfund(Transaction transaction) {
        String myFitid;
        BuyMutualFund buyMutualfund = new BuyMutualFund();
        InvestmentBuy investmentBuy = new InvestmentBuy();
        InvestmentTransaction investmentTransaction = new InvestmentTransaction();
        myFitid = "100000" + transaction.getFitid() + transaction.getUnit() + transaction.getSymbol();
        investmentTransaction.setFITID("Achat" + transaction.getDate().format(Utilities.myDateFormat()) + myFitid);
        investmentTransaction.setDTTRADE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setDTSETTLE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setMEMO("Achat");
        investmentBuy.setINVTRAN(investmentTransaction);
        SecurityId securityId = new SecurityId();
        securityId.setUNIQUEID(transaction.getSymbol());
        securityId.setUNIQUEIDTYPE("CUSIP");
        investmentBuy.setSECID(securityId);
        investmentBuy.setUNITS(transaction.getUnit());
        investmentBuy.setUNITPRICE(transaction.getPrice());
        investmentBuy.setTOTAL("-" + transaction.getAmount());
        investmentBuy.setSUBACCTSEC(SubAccountEnum.CASH);
        investmentBuy.setSUBACCTFUND(SubAccountEnum.CASH);
        buyMutualfund.setBUYTYPE(BuyEnum.BUY);
        buyMutualfund.setINVBUY(investmentBuy);
        return buyMutualfund;
    }

    private static Reinvest genReinvest(Transaction transaction) {
        String myFitid;
        Reinvest reinvest = new Reinvest();
        InvestmentTransaction investmentTransaction = new InvestmentTransaction();
        myFitid = "100000" + transaction.getFitid() + transaction.getUnit() + transaction.getSymbol();
        investmentTransaction.setFITID("ReInvest" + transaction.getDate().format(Utilities.myDateFormat()) + myFitid);
        investmentTransaction.setDTTRADE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setDTSETTLE(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        investmentTransaction.setMEMO("ReInvest");
        reinvest.setINVTRAN(investmentTransaction);
        SecurityId securityId = new SecurityId();
        securityId.setUNIQUEID(transaction.getSymbol());
        securityId.setUNIQUEIDTYPE("CUSIP");
        reinvest.setSECID(securityId);
        reinvest.setUNITS(transaction.getUnit());
        reinvest.setUNITPRICE(transaction.getPrice());
        reinvest.setTOTAL("-" + transaction.getAmount());
        reinvest.setSUBACCTSEC(SubAccountEnum.CASH);
        reinvest.setINCOMETYPE(IncomeEnum.DIV);
        return reinvest;
    }

    private static InvestmentBankTransaction genBankTransaction(Transaction transaction) {
        InvestmentBankTransaction investmentBankTransaction = new InvestmentBankTransaction();
        investmentBankTransaction.setSUBACCTFUND(SubAccountEnum.CASH);
        StatementTransaction statementTransaction = new StatementTransaction();
        if ("Debit".equals(transaction.getType())) {
            statementTransaction.setTRNTYPE(TransactionEnum.DEBIT);
            statementTransaction.setTRNAMT("-" + transaction.getAmount());
        } else {
            statementTransaction.setTRNTYPE(TransactionEnum.CREDIT);
            statementTransaction.setTRNAMT(transaction.getAmount());
        }
        statementTransaction.setDTPOSTED(transaction.getDate().format(Utilities.myDateFormat()) + "100000");
        statementTransaction.setFITID(transaction.getType() + transaction.getDate().format(Utilities.myDateFormat()) + "100000" + transaction.getAmount());
        statementTransaction.setNAME(transaction.getType());
        statementTransaction.setMEMO(transaction.getFitid());
        investmentBankTransaction.setSTMTTRN(statementTransaction);
        return investmentBankTransaction;
    }

    private static PositionMutualFund genPositionMutualfund(String symbol, String units, String unitPrice, String marketValue, String datePrice) {
        PositionMutualFund positionMutualFund = new PositionMutualFund();
        InvestmentPosition investmentPosition = new InvestmentPosition();
        SecurityId securityId = new SecurityId();
        securityId.setUNIQUEID(symbol);
        securityId.setUNIQUEIDTYPE("CUSIP");
        investmentPosition.setSECID(securityId);
        investmentPosition.setHELDINACCT(SubAccountEnum.CASH);
        investmentPosition.setPOSTYPE(PositionTypeEnum.LONG);
        investmentPosition.setUNITS(units);
        investmentPosition.setUNITPRICE(unitPrice);
        investmentPosition.setMKTVAL(marketValue);
        investmentPosition.setDTPRICEASOF(datePrice);
        positionMutualFund.setINVPOS(investmentPosition);
        return positionMutualFund;
    }

    private static MutualFundInfo genMutualFundInfo(String symbol) {
        MutualFundInfo mutualFundInfo = new MutualFundInfo();
        GeneralSecurityInfo generalSecurityInfo = new GeneralSecurityInfo();
        SecurityId securityId = new SecurityId();
        securityId.setUNIQUEID(symbol);
        securityId.setUNIQUEIDTYPE("CUSIP");
        generalSecurityInfo.setSECID(securityId);
        generalSecurityInfo.setSECNAME(symbol);
        generalSecurityInfo.setTICKER(symbol);
        mutualFundInfo.setSECINFO(generalSecurityInfo);
        mutualFundInfo.setMFTYPE(MutualFundTypeEnum.OPENEND);
        return mutualFundInfo;
    }

    /**
     * @return the currency
     */
    public static String getCurrency() {
        return currency;
    }

    /**
     * @param aCurrency the currency to set
     */
    public static void setCurrency(String aCurrency) {
        currency = aCurrency;
    }

    /**
     * @return the intubid
     */
    public static String getIntubid() {
        return intubid;
    }

    /**
     * @param aIntubid the intubid to set
     */
    public static void setIntubid(String aIntubid) {
        intubid = aIntubid;
    }
}
