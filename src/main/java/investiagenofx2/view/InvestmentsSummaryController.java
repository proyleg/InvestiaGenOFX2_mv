/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2.view;

import investiagenofx2.model.Investment;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author Pierre
 */
public class InvestmentsSummaryController implements Initializable {

    @FXML
    private TableView<Investment> table_tv;
    @FXML
    private TableColumn<Investment, String> symbol_tc;
    @FXML
    private TableColumn<Investment, String> name_tc;
    @FXML
    private TableColumn<Investment, Float> lastPrice_tc;
    @FXML
    private TableColumn<Investment, Float> quantity_tc;
    @FXML
    private TableColumn<Investment, Float> marketValue_tc;
    @FXML
    private TableColumn<Investment, Float> percentage_tc;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        symbol_tc.setCellValueFactory(new PropertyValueFactory<>("symbol"));
        name_tc.setCellValueFactory(new PropertyValueFactory<>("name"));
        quantity_tc.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        lastPrice_tc.setCellValueFactory(new PropertyValueFactory<>("lastPrice"));
        marketValue_tc.setCellValueFactory(new PropertyValueFactory<>("marketValue"));
        percentage_tc.setCellValueFactory(new PropertyValueFactory<>("percentage"));

        table_tv.setItems(InvestiaGenOFXController.getInvestments()); // assign the data to the table

        Callback<TableColumn<Investment, Float>, TableCell<Investment, Float>> floatFourDigitsRight = new Callback<TableColumn<Investment, Float>, TableCell<Investment, Float>>() {
            @Override
            public TableCell<Investment, Float> call(TableColumn<Investment, Float> col) {
                TableCell<Investment, Float> cell = new TableCell<Investment, Float>() {
                    @Override
                    public void updateItem(Float value, boolean empty) {
                        super.updateItem(value, empty);
                        if (value == null) {
                            setText(null);
                        } else {
                            NumberFormat numberForm = NumberFormat.getNumberInstance(Locale.CANADA_FRENCH);
                            numberForm.setMinimumFractionDigits(4);
                            setText(numberForm.format(value.floatValue()));
                        }
                    }
                };
                cell.setAlignment(Pos.TOP_RIGHT);
                return cell;
            }
        };
        Callback<TableColumn<Investment, Float>, TableCell<Investment, Float>> floatCurrencyRight = new Callback<TableColumn<Investment, Float>, TableCell<Investment, Float>>() {
            @Override
            public TableCell<Investment, Float> call(TableColumn<Investment, Float> col) {
                TableCell<Investment, Float> cell = new TableCell<Investment, Float>() {
                    @Override
                    public void updateItem(Float value, boolean empty) {
                        super.updateItem(value, empty);
                        if (value == null) {
                            setText(null);
                        } else {
                            NumberFormat currencyForm = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
                            setText(currencyForm.format(value.floatValue()));
                        }
                    }
                };
                cell.setAlignment(Pos.TOP_RIGHT);
                return cell;
            }
        };
        Callback<TableColumn<Investment, Float>, TableCell<Investment, Float>> floatPercentageRight = new Callback<TableColumn<Investment, Float>, TableCell<Investment, Float>>() {
            @Override
            public TableCell<Investment, Float> call(TableColumn<Investment, Float> col) {
                TableCell<Investment, Float> cell = new TableCell<Investment, Float>() {
                    @Override
                    public void updateItem(Float value, boolean empty) {
                        super.updateItem(value, empty);
                        if (value == null) {
                            setText(null);
                        } else {
                            NumberFormat percentageForm = NumberFormat.getPercentInstance(Locale.CANADA_FRENCH);
                            percentageForm.setMinimumFractionDigits(2);
                            setText(percentageForm.format(value));
                        }
                    }
                };
                cell.setAlignment(Pos.TOP_RIGHT);
                return cell;
            }
        };
        quantity_tc.setCellFactory(floatFourDigitsRight);
        lastPrice_tc.setCellFactory(floatCurrencyRight);
        marketValue_tc.setCellFactory(floatCurrencyRight);
        percentage_tc.setCellFactory(floatPercentageRight);
    }
}
