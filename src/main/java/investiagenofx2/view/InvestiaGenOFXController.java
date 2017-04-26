/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2.view;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlHeading4;
import com.gargoylesoftware.htmlunit.html.HtmlHeading5;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSection;
import com.gargoylesoftware.htmlunit.html.HtmlPasswordInput;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import investiagenofx2.InvestiaGenOFX;
import investiagenofx2.model.Account;
import investiagenofx2.model.Investment;
import investiagenofx2.model.Transaction;
import investiagenofx2.util.MyOwnException;
import investiagenofx2.util.OFXUtilites;
import investiagenofx2.util.PropertiesInit;
import investiagenofx2.util.Utilities;

import java.io.File;
import java.io.IOException;

import java.net.URL;
import java.time.LocalDate;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import ofx.OFX;
import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.text.WordUtils.capitalizeFully;

/**
 * FXML Controller class
 *
 * @author Pierre
 */
public class InvestiaGenOFXController implements Initializable {

    private static final int[] linkAccountToLocalAccountIndex = new int[25];
    private static HtmlPage htmlPage;
    private static ArrayList<Account> accounts;
    private static String accountOwnerName;
    private static LocalDate dataAsDate;
    private static ObservableList<Investment> investments;
    private static final Collection<String> fitids = new ArrayList<>();
    @FXML
    private TextField txt_investiaURL;
    @FXML
    private ComboBox<String> cbo_clientNum;
    @FXML
    private PasswordField psw_password;
    @FXML
    private Button btn_login;
    @FXML
    private Button btn_logout;
    @FXML
    private Button btn_accounts;
    @FXML
    private Button btn_summary;
    @FXML
    private ComboBox<String> cbo_accounts;
    @FXML
    private DatePicker dtp_lastDate;
    @FXML
    private MenuItem mnu_quitter;
    @FXML
    private Label lbl_ownername;
    @FXML
    private Label lbl_message;

    public static void addAccount(Account account) {
        accounts.add(account);
        int localAccountIndex = accounts.size() - 1;
        int linkAccountIndex = PropertiesInit.getLinkAccountIndex(accountOwnerName.split(" ")[0] + "\\" + account.getAccountType() + "\\" + account.getAccountProvider());
        linkAccountToLocalAccountIndex[linkAccountIndex] = localAccountIndex;
    }

    private static String genOFXFile(ArrayList<Account> accounts) throws MyOwnException {
        OFXUtilites.setCurrency("CAD");
        OFXUtilites.setIntubid("04297");
        OFX ofx = new OFX();
        ofx.setSIGNONMSGSRSV1(OFXUtilites.genSignonResponseMessageSet(dataAsDate.format(Utilities.myDateFormat()) + "100000", "Investia"));
        ofx.setINVSTMTMSGSRSV1(OFXUtilites.genTransacInvestmentStatementResponseMessageSet(accounts));
        ofx.setSECLISTMSGSRSV1(OFXUtilites.genSecurityListResponseMessageSet(accounts));
        String fileName;
        if (accounts.size() > 1) {
            fileName = "Investia-" + accountOwnerName.split(" ")[0] + "TousLesComptes-" + dataAsDate.format(Utilities.myDateFormat()) + ".qfx";
        } else {
            fileName = "Investia-" + accounts.get(0).getAccountID() + "-" + dataAsDate.format(Utilities.myDateFormat()) + ".qfx";
        }
        Utilities.genOFXFile(ofx, fileName);
        return fileName;
    }

    /**
     * @return the investments
     */
    public static ObservableList<Investment> getInvestments() {
        return investments;
    }

    /**
     * @return the dataAsDate
     */
    public static LocalDate getDataAsDate() {
        return dataAsDate;
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txt_investiaURL.setText(PropertiesInit.getInvestiaURL());
        dtp_lastDate.setValue(LocalDate.parse(PropertiesInit.getLastGenUsedDate()));
        String[] clientNums = PropertiesInit.getClientNumList().split(",");
        for (String clientNum : clientNums) {
            if (!clientNum.trim().isEmpty()) {
                cbo_clientNum.getItems().add(clientNum.trim());
            }
        }
        Arrays.fill(linkAccountToLocalAccountIndex, -1);
        resetControls();

        cbo_clientNum.getEditor().addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            if (event.getCode() == KeyCode.DELETE) {
                cbo_clientNum.getItems().remove(cbo_clientNum.getValue());
                event.consume();
            }
        });

        dtp_lastDate.setConverter(new StringConverter<LocalDate>() {
            final String pattern = "yyyy-MM-dd";
            final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

            {
                dtp_lastDate.setPromptText(pattern.toLowerCase());
            }

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && !string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        });

        //This deals with the bug located here where the datepicker value is not updated on focus lost
        //https://bugs.openjdk.java.net/browse/JDK-8092295?page=com.atlassian.jira.plugin.system.issuetabpanels:all-tabpanel
        dtp_lastDate.focusedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue) {
                    dtp_lastDate.setValue(dtp_lastDate.getConverter().fromString(dtp_lastDate.getEditor().getText()));
                }
            }
        });
    }

    private void resetControls() {
        btn_login.setDisable(false);
        btn_logout.setDisable(true);
        cbo_clientNum.setDisable(false);
        cbo_clientNum.getEditor().setText("");
        cbo_accounts.getItems().clear();
        cbo_accounts.setDisable(true);
        psw_password.setDisable(false);
        psw_password.setText("");
        lbl_ownername.setText("");
        txt_investiaURL.setDisable(true);
        mnu_quitter.setDisable(false);
        btn_accounts.setDisable(true);
        btn_summary.setDisable(true);
    }

    private void setControlsOnceLogin() {
        btn_login.setDisable(true);
        btn_logout.setDisable(false);
        btn_accounts.setDisable(false);
        btn_summary.setDisable(false);
        mnu_quitter.setDisable(true);
        cbo_clientNum.setDisable(true);
        cbo_accounts.setDisable(false);
        lbl_ownername.setText(accountOwnerName);
        psw_password.setDisable(true);
        txt_investiaURL.setDisable(true);
        lbl_message.setText("");
        if (!cbo_clientNum.getItems()
                .contains(cbo_clientNum.getEditor().getText()) && !cbo_clientNum.getEditor().getText().trim().isEmpty()) {
            cbo_clientNum.getItems().add(cbo_clientNum.getEditor().getText());
        }
    }

    @FXML
    void handleBtnSummary(ActionEvent event) {
        ArrayList<Account> accountsToGen = new ArrayList<>();
        if ("Tous les comptes".equals(cbo_accounts.getSelectionModel().getSelectedItem())) {
            accountsToGen = accounts;
        } else {
            accountsToGen.add(accounts.get(cbo_accounts.getSelectionModel().getSelectedIndex()));
        }
        showAcountsInvestments(accountsToGen);
    }

    @FXML
    void handleMnuQuit(ActionEvent event) {
        InvestiaGenOFX.getWebClient().close();
        PropertiesInit.setInvestiaURL(txt_investiaURL.getText());
        PropertiesInit.setLastGenUsedDate(dtp_lastDate.getValue().toString());
        PropertiesInit.setClientNumList(cbo_clientNum.getItems().toString().replace("[", "").replace("]", ""));
        PropertiesInit.setProperties();
        Platform.exit();
        System.exit(0);
    }

    @FXML
    void handleBtnLogin(ActionEvent event) {
        try {
            if (InvestiaGenOFX.debug) {
                htmlPage = InvestiaGenOFX.getWebClient().getPage(InvestiaGenOFX.debugPath + "/Investia-Login.htm");
            } else {
                htmlPage = InvestiaGenOFX.getWebClient().getPage(txt_investiaURL.getText() + "?wcag=true");
            }
            HtmlForm form = htmlPage.getHtmlElementById("frmLogin");
            HtmlTextInput userId = form.getInputByName("UserName");
            HtmlPasswordInput password = form.getInputByName("Password");
            if (cbo_clientNum.getEditor().getText().length() == 0 || psw_password.getText().length() == 0) {
                lbl_message.setText("Le numéro de client et mot de passe ne peuvent être vide");
                return;
            }
            userId.setValueAttribute(cbo_clientNum.getEditor().getText());
            password.setValueAttribute(psw_password.getText());
            HtmlSubmitInput signInButton = (HtmlSubmitInput) form.getByXPath("//input[contains(@class, 'btn-investia-blue')]").get(0);
            if (InvestiaGenOFX.debug) {
                htmlPage = InvestiaGenOFX.getWebClient().getPage(InvestiaGenOFX.debugFullPath + "-DashBoard.htm");
            } else {
                htmlPage = signInButton.click();
            }
        } catch (Exception ex) {
            lbl_message.setText("Le système ne smble pas accessible. Voir le fichier de log...");
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        try {
            HtmlDivision div = (HtmlDivision) htmlPage.getByXPath("//div[contains(@class, 'validation-summary-errors')]").get(0);
            lbl_message.setText(div.asText());
            return;
        } catch (Exception ex) { // do nothing
        }

        getAccountsFromWeb();
        setControlsOnceLogin();
        getAccountsInvestmentsFromWeb();
        setAccountsInvestmentsPercentage();
        for (Account account : accounts) {
            cbo_accounts.getItems().add(account.getAccountType());
        }
        cbo_accounts.getItems().add("Tous les comptes");
        cbo_accounts.setValue("Tous les comptes");
    }

    @FXML
    void handleBtnLogout(ActionEvent event) {
        try {
            if (InvestiaGenOFX.debug) {
                htmlPage = InvestiaGenOFX.getWebClient().getPage(InvestiaGenOFX.debugPath + "/Investia-Login.htm");
            } else {
                htmlPage = InvestiaGenOFX.getWebClient().getPage(txt_investiaURL.getText() + "/Account/LogOff" + "?wcag=true");
            }
            htmlPage.getHtmlElementById("frmLogin");
        } catch (Exception ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Arrays.fill(linkAccountToLocalAccountIndex, -1);
        PropertiesInit.removeUnknownAccounts();
        resetControls();
    }

    private void getAccountsFromWeb() {
        String name = "Nom Pastrouvé";
        try {
            name = htmlPage.getHtmlElementById("phase1CustomerName").asText();
            name = name.replace("Mme ", "").trim();
            name = name.replace("M. ", "").trim();
        } catch (ElementNotFoundException ex) {
            try {
                name = htmlPage.getHtmlElementById("selAccount").asText();
                name = name.replaceAll("[^A-Za-z ]", "").trim();
            } catch (ElementNotFoundException ignored) {
            }
        }
        name = capitalizeFully(name);
        String[] token = name.split(" ");
        accountOwnerName = token[0] + " " + token[1];
//        token = ((HtmlDivision) htmlPage.getByXPath("//div[contains(@class, 'col-xs-4 text-right')]").get(0)).asText().split(" ");
//        dataAsDate = LocalDate.parse(token[token.length - 1], DateTimeFormatter.ISO_DATE);
        dataAsDate = LocalDate.now();
        accounts = new ArrayList<>();
        try {
            if (InvestiaGenOFX.debug) {
                htmlPage = InvestiaGenOFX.getWebClient().getPage(InvestiaGenOFX.debugFullPath + "-Investments.htm");
            } else {
                htmlPage = InvestiaGenOFX.getWebClient().getPage(txt_investiaURL.getText() + "/Investments/ValueOf" + "?wcag=true");
            }

            List<?> sections = htmlPage.getByXPath("//section[not(contains(@id, 'valueOf'))]");
            for (int i = 1; i < sections.size(); i++) {
                HtmlSection section = (HtmlSection) sections.get(i);
                HtmlHeading4 h4 = (HtmlHeading4) section.getElementsByTagName("h4").get(0);
                token = h4.asText().replaceAll("[\\\\,]", "").split(" - ");
                Account account = new Account(token[0], token[1], dataAsDate);
                try {
                    HtmlHeading5 h5 = (HtmlHeading5) section.getElementsByTagName("h5").get(0);
                    token = h5.asText().split(" ");
                    if (token[0].startsWith("Numéro")) {
                        account.setAccountID(token[token.length - 1]);
                    }
                } catch (IndexOutOfBoundsException ignored) {
                }
                addAccount(account);
            }
        } catch (Exception ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void handleBtnAccounts(ActionEvent event) {
        for (Account account : accounts) {
            account.removeAllTransactions();
        }
        ArrayList<Account> accountsToGen = new ArrayList<>();
        if ("Tous les comptes".equals(cbo_accounts.getSelectionModel().getSelectedItem())) {
            accountsToGen = accounts;
        } else {
            accountsToGen.add(accounts.get(cbo_accounts.getSelectionModel().getSelectedIndex()));
        }
        getTransactionsFromWeb();
        String fileName = "";
        try {
            fileName = genOFXFile(accountsToGen);
        } catch (MyOwnException ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation ");
        alert.setHeaderText(null);
        alert.setX(InvestiaGenOFX.getPrimaryStage().getX() + 100);
        alert.setY(InvestiaGenOFX.getPrimaryStage().getY() + 100);
        alert.setContentText("Fichier OFX généré \rLance le fichier OFX?");
        ButtonType buttonTypeYes = new ButtonType("Oui");
        ButtonType buttonTypeNo = new ButtonType("Non");
        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);
        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == buttonTypeYes) {
            try {
                Utilities.launchFile(fileName);
            } catch (IOException ex) {
                Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
            }
            new File(fileName).deleteOnExit();
        }
        showAcountsInvestments(accountsToGen);
    }

    private void getTransactionsFromWeb() {
        try {
            if (!htmlPage.getUrl().toString().contains("/TransactionReports/Select")) {
                if (InvestiaGenOFX.debug) {
                    htmlPage = InvestiaGenOFX.getWebClient().getPage(InvestiaGenOFX.debugFullPath + "-Transactions.htm");
                } else {
                    htmlPage = InvestiaGenOFX.getWebClient().getPage(txt_investiaURL.getText() + "/TransactionReports/Select" + "?wcag=true");
                    waitForGeneratedTransactions();
                }
            }
            List<HtmlHeading4> h4from = htmlPage.getByXPath("//h4[contains(text(),'Période: de ')]");
            String from = h4from.get(0).asText();
            int index = from.indexOf("Période: de ");
            LocalDate selFromDate = LocalDate.parse(from.substring(index + 12, index + 12 + 10));

            if (dtp_lastDate.getValue().isBefore(selFromDate)) {
                List<HtmlForm> forms = htmlPage.getByXPath("//form");
                HtmlForm form = forms.get(1);
                HtmlTextInput selPerFrom = form.getInputByName("selPerFrom");
                selPerFrom.setValueAttribute(dtp_lastDate.getValue().toString());

                HtmlAnchor generate = (HtmlAnchor) form.getByXPath("//a[contains(@class, 'btn-investia-blue')]").get(0);
                if (InvestiaGenOFX.debug) {
                    htmlPage = InvestiaGenOFX.getWebClient().getPage(InvestiaGenOFX.debugFullPath + "-Transactions.htm");
                } else {
                    htmlPage = generate.click();
                    waitForGeneratedTransactions();
                }
            }

            HtmlTable htmlTable = (HtmlTable) htmlPage.getElementById("tblTransactionReports");
            if (htmlTable == null) {
                return;
            }
            for (int i = 0; i < htmlTable.getRowCount(); i++) {
                LocalDate transacDate = LocalDate.parse(htmlTable.getCellAt(i, 0).getTextContent(), DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.CANADA_FRENCH));
                if (transacDate.isBefore(dtp_lastDate.getValue())) {
                    break;
                }
                String transacType = htmlTable.getCellAt(i, 2).getTextContent();
                String[] token = transacType.split("[\\-/(]");
                switch (token[0].replace(" ", "").toLowerCase()) {
                    case "dividendes":
                        transacType = "Distribution";
                        break;
                    case "achat":
                    case "échangeentrant":
                    case "prélèvementautomatique":
                    case "transfertentrantdecourtier":
                    case "transfertexterneentrant":
                    case "transfertinterneentrant":
                        transacType = "Purchase";
                        break;
                    case "échangesortant":
                    case "rachat":
                    case "transfertexternesortant":
                    case "transf.int.sort.":
                    case "transf.int.sortant":
                    case "transfertinternesortant":
                        transacType = "Switch Out";
                        break;
                    case "dépôt":
                        transacType = "Credit";
                        break;
                    case "retrait":
                    case "retenue":
                        transacType = "Debit";
                        break;
                    case "créditenespèces":
                    case "entréed'espèces":
                    case "fraisd'administration":
                    case "sortied'espèces":
                    case "transfertd'espècesentrant":
                    case "transfertd'espècessortant":
                        continue;
                    default:
                        try {
                            throw new MyOwnException("Type de transaction non prise en charge: " + transacType.trim());
                        } catch (MyOwnException ex) {
                            Logger.getLogger(OFXUtilites.class.getName()).log(Level.SEVERE, null, ex);
                            continue;
                        }
                }

                String transacAccount = accountOwnerName.split(" ")[0] + "\\" + htmlTable.getCellAt(i, 1).getTextContent();
                String symbol = htmlTable.getCellAt(i, 3).getTextContent();
                String unit = htmlTable.getCellAt(i, 5).getTextContent().replaceAll("[^0-9,]", "").replace(",", ".");
                String fitid = "";
                String price = "0.00";
                String amount;
                if ("Credit".equals(transacType) || "Debit".equals(transacType)) {
                    amount = htmlTable.getCellAt(i, 9).getTextContent().replaceAll("[^0-9,]", "").replace(",", ".");
                    fitid = StringUtils.stripAccents(htmlTable.getCellAt(i, 2).getTextContent());
                } else {
                    amount = htmlTable.getCellAt(i, 10).getTextContent().replaceAll("[^0-9,]", "").replace(",", ".");
                    price = Float.toString(Float.parseFloat(amount) / Float.parseFloat(unit));
                }
                if (PropertiesInit.getLinkAccountsTransac().indexOf(transacAccount) < 0) {
                    linkAccountTransac(transacAccount);
                }
                int idxAccount = linkAccountToLocalAccountIndex[PropertiesInit.getLinkAccountsTransac().indexOf(transacAccount)];
                int fitidseq = 1;
                while (fitids.contains(transacDate + transacType + amount + fitid + symbol + unit + price)){
                    fitidseq++;
                    fitid = Integer.toString(fitidseq);
                }
                fitids.add(transacDate + transacType + amount + fitid + symbol + unit + price);
                accounts.get(idxAccount).add(new Transaction(transacDate, transacType, amount, fitid, symbol, unit, price, ""));
            }
        } catch (Exception ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void waitForGeneratedTransactions() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            if (htmlPage.getHtmlElementById("divResult").asText().contains("Génération en cours")) {
                Thread.sleep(1000);
            } else {
                Thread.sleep(3000);
                break;
            }
        }
    }

    private void linkAccountTransac(String linkAccountTransac) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getClassLoader().getResource("view/linkaccountTransac.fxml"));
            AnchorPane page = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Associer les comptes");
            dialogStage.getIcons().add(new Image("/myIcons/Teddy-Bear-Sick-icon.png"));
            dialogStage.initModality(Modality.WINDOW_MODAL);
            Scene scene = new Scene(page);
            dialogStage.initOwner(InvestiaGenOFX.getPrimaryStage());
            dialogStage.setScene(scene);
            InvestiaGenOFX.setOnCloseRequest(dialogStage);

            LinkaccountTransacController controller = loader.getController();
            controller.setlinkAccountTransac(linkAccountTransac);
            dialogStage.showAndWait();
        } catch (Exception ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getAccountsInvestmentsFromWeb() {
        List<HtmlTable> tables = htmlPage.getByXPath("//table[contains(@class, 'table-striped')]");
        LocalDate balancesAs = LocalDate.now();
//        String labelDate = "Soldes au ";
//        LocalDate balancesAs;
//        @SuppressWarnings(("unchecked"))
//        List<HtmlDivision> divBalancesAs = (List<HtmlDivision>) htmlPage.getByXPath("//div[contains(text(),'"+labelDate +"')]");
//        if (divBalancesAs.size()>0) {
//            balancesAs = LocalDate.parse(divBalancesAs.get(0).asText().replace(labelDate, ""), DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.CANADA_FRENCH));
//        } else {
//            labelDate = "Données en date du ";
//            @SuppressWarnings(("unchecked"))
//            List<HtmlDivision> divBalancesAs2 = (List<HtmlDivision>) htmlPage.getByXPath("//div[contains(text(),'" + labelDate + "')]");
//            balancesAs = LocalDate.parse(divBalancesAs2.get(0).asText().replace(labelDate, ""), DateTimeFormatter.ISO_DATE);
//        }
        int i = 0;
        for (HtmlTable table : tables) {
            if (!table.asText().contains("Numéro de \r\n compte")) {
                continue;
            }
            if (accounts.get(i).getAccountID() == null) {
                accounts.get(i).setAccountID(table.getCellAt(1, 3).getTextContent());
            }
            Float total = 0f;
            for (int j = 1; j < table.getRowCount(); j++) {
                String symbol = table.getCellAt(j, 1).getTextContent();
                String name = table.getCellAt(j, 0).getTextContent();
                String quantity = table.getCellAt(j, 5).getTextContent().replaceAll("[^0-9,]", "").replace(",", ".");
                String lastPrice = table.getCellAt(j, 6).getTextContent().replaceAll("[^0-9,]", "").replace(",", ".");
                String marketValue = table.getCellAt(j, 7).getTextContent().replaceAll("[^0-9,]", "").replace(",", ".");
                Investment investment = new Investment(symbol, name, quantity, lastPrice, marketValue);
                accounts.get(i).add(investment);
                total += Float.valueOf(marketValue);
            }
            String totalString = String.format("%.02f", total);
            Investment investment = new Investment("", "Total", totalString, "1.00", totalString);
            accounts.get(i).add(investment);
            if (!balancesAs.equals(dataAsDate)) accounts.get(i).setBalanceDate(balancesAs);
            i++;
        }
        if (!balancesAs.equals(dataAsDate)) dataAsDate = balancesAs;
    }

    private void setAccountsInvestmentsPercentage() {
        for (Account account : accounts) {
            Float marketValue = Float.valueOf(account.getMarketValue());
            for (int j = 0; j < account.getInvestments().size(); j++) {
                Float invValue = account.getInvestments().get(j).getMarketValue();
                account.getInvestments().get(j).setPercentage(invValue / marketValue);
            }
        }
    }

    private void showAcountsInvestments(ArrayList<Account> accounts) {
        double x = InvestiaGenOFX.getPrimaryStage().getX();
        double y = InvestiaGenOFX.getPrimaryStage().getY();
        for (Account account : accounts) {
            investments = account.getInvestments();
            x = x + 20;
            y = y + 60;
            if (!"Unknown".equals(account.getAccountProvider())) {
                showInvestmentsSummary(account.getAccountType(), x, y);
            }
        }
    }

    private void showInvestmentsSummary(String accountType, Double x, Double y) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getClassLoader().getResource("view/investmentsSummary.fxml"));
            AnchorPane page = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Sommaire des Investissements " + accountType);
            dialogStage.getIcons().add(new Image("/myIcons/Teddy-Bear-Sick-icon.png"));
            dialogStage.initModality(Modality.NONE);
            Scene scene = new Scene(page);
            dialogStage.initOwner(InvestiaGenOFX.getPrimaryStage());
            dialogStage.setX(x);
            dialogStage.setY(y);
            dialogStage.setScene(scene);
            dialogStage.show();
        } catch (Exception ex) {
            Logger.getLogger(InvestiaGenOFXController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    void handleMnuAbout(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        ((Stage) alert.getDialogPane().getScene().getWindow()).getIcons().add(new Image("/myIcons/Teddy-Bear-Sick-icon.png"));
        alert.setTitle("Information");
        alert.setX(InvestiaGenOFX.getPrimaryStage().getX() + 100);
        alert.setY(InvestiaGenOFX.getPrimaryStage().getY() + 100);
        alert.setHeaderText("InvestiaGenOFX");
        alert.setContentText("Version 2.0_11");
        alert.show();
    }
}
