/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2.view;

import investiagenofx2.model.Account;
import investiagenofx2.util.PropertiesInit;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pierre
 */
public class LinkaccountTransacController implements Initializable {

    private String linkAccountTransac;
    private String user;

    @FXML
    private Label lbl_LnkAccountTransac;
    @FXML
    private ComboBox<String> cbo_linkaccount;
    @FXML
    private Button btn_Associer;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    void handleBtnLinkAccount(ActionEvent event) {
        if (cbo_linkaccount.getSelectionModel().getSelectedIndex() < 0) {
            return;
        }
        int idx = PropertiesInit.getLinkAccountIndex(user + "\\" + cbo_linkaccount.getSelectionModel().getSelectedItem());
        PropertiesInit.getLinkAccountsTransac().set(idx, linkAccountTransac);
        ((Stage) lbl_LnkAccountTransac.getScene().getWindow()).close();
    }

    @FXML
    void handleBtnAncienCompte(ActionEvent event) {
        String[] token = linkAccountTransac.split("\\\\");
        Account account = new Account(token[1], "Unknown", InvestiaGenOFXController.getDataAsDate());
        account.setAccountID(linkAccountTransac);
        InvestiaGenOFXController.addAccount(account);
        int idx = PropertiesInit.getLinkAccountIndex(linkAccountTransac + "\\" + "Unknown");
        PropertiesInit.getLinkAccountsTransac().set(idx, linkAccountTransac);
        ((Stage) lbl_LnkAccountTransac.getScene().getWindow()).close();
    }

    /**
     * @param account
     */
    public void setlinkAccountTransac(String account) {
        this.linkAccountTransac = account;
        String[] token = account.split("\\\\");
        this.user = token[0];
        lbl_LnkAccountTransac.setText(token[1]);
        ArrayList<String> userlinkAccount = new ArrayList<>();
        ArrayList<String> linkAccounts = PropertiesInit.getLinkAccounts();
        ArrayList<String> linkAccountsTransac = PropertiesInit.getLinkAccountsTransac();
        for (int i = 0; i < linkAccounts.size(); i++) {
            if (linkAccounts.get(i).startsWith(user) && "NotAssigned".equals(linkAccountsTransac.get(i))) {
                token = linkAccounts.get(i).split("\\\\");
                userlinkAccount.add(token[1] + "\\" + token[2]);
            }
        }
        cbo_linkaccount.getItems().addAll(userlinkAccount);
        if (cbo_linkaccount.getItems().size() <= 0) {
            btn_Associer.setDisable(true);
        }
    }
}
