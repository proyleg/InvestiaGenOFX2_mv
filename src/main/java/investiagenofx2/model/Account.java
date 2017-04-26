/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2.model;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author Pierre
 */
public class Account {

    private String accountID;
    private final String accountType;
    private final String accountProvider;
    private String marketValue = "0.00";
    private LocalDate balanceDate;
    private final ObservableList<Investment> investments = FXCollections.observableArrayList();
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private LocalDate transacDateHigh = LocalDate.parse("1900-01-01");
    private LocalDate transacDateLow = LocalDate.parse("9999-12-31");

    /**
     * @param accountType
     * @param accountProvider
     * @param balanceDate
     */
    public Account(String accountType, String accountProvider, LocalDate balanceDate) {
        this.accountType = accountType;
        this.accountProvider = accountProvider;
        this.balanceDate = balanceDate;
    }

    /**
     * @return the accountID
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * @param aAccountID the accountID to set
     */
    public void setAccountID(String aAccountID) {
        accountID = aAccountID;
    }

    /**
     * @param investment to add to investments
     */
    public void add(Investment investment) {
        investments.add(investment);
        if ("Total".equals(investment.getName())) return;
        marketValue = String.format("%.02f", investment.getMarketValue() + Float.valueOf(marketValue));
    }

    /**
     * @param transaction to add to transactions transacDateHigh and
     *                    transacDateLow will also be updated if needed
     */
    public void add(Transaction transaction) {
        transactions.add(transaction);
        if (transaction.getDate().isAfter(transacDateHigh)) {
            transacDateHigh = transaction.getDate();
        }
        if (transaction.getDate().isBefore(transacDateLow)) {
            transacDateLow = transaction.getDate();
        }
    }

    /**
     * @return a copy of investments to make sure getInvestments().methods don't
     * affect investments of Account
     */
    public ObservableList<Investment> getInvestments() {
        ObservableList<Investment> investmentsCopy = FXCollections.observableArrayList();
        investmentsCopy.addAll(0, investments);
        return investmentsCopy;
    }

    /**
     * @return the accountType
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * @return the marketValue
     */
    public String getMarketValue() {
        return marketValue;
    }

    /**
     * @return the balanceDate
     */

    public LocalDate getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(LocalDate balanceDate) {
        this.balanceDate = balanceDate;
    }

    /**
     * @return a copy of transactions to make sure getTransactions().methods
     * don't affect transactions of Account
     */
    @SuppressWarnings("unchecked")
    public ArrayList<Transaction> getTransactions() {
        ArrayList<Transaction> transactionsCopy;
        transactionsCopy = (ArrayList<Transaction>) transactions.clone();
        return transactionsCopy;
    }

    /**
     * @return the transacDateHigh
     */
    public LocalDate getTransacDateHigh() {
        return transacDateHigh;
    }

    /**
     * @param transacDateHigh the transacDateHigh to set
     */
    public void setTransacDateHigh(LocalDate transacDateHigh) {
        this.transacDateHigh = transacDateHigh;
    }

    /**
     * @return the transacDateLow
     */
    public LocalDate getTransacDateLow() {
        return transacDateLow;
    }

    /**
     * @param transacDateLow the transacDateLow to set
     */
    public void setTransacDateLow(LocalDate transacDateLow) {
        this.transacDateLow = transacDateLow;
    }


    public void removeAllTransactions() {
        this.transactions = new ArrayList<>();
    }
    /**
     * @return the accountProvider
     */
    public String getAccountProvider() {
        return accountProvider;
    }
}
