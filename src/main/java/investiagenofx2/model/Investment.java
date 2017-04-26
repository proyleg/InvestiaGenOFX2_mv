/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investiagenofx2.model;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * @author Pierre
 */
public class Investment {

    private final SimpleStringProperty symbol = new SimpleStringProperty();
    private final SimpleStringProperty name = new SimpleStringProperty();
    private final SimpleFloatProperty lastPrice = new SimpleFloatProperty();
    private final SimpleFloatProperty quantity = new SimpleFloatProperty();
    private final SimpleFloatProperty marketValue = new SimpleFloatProperty();
    private final SimpleFloatProperty percentage = new SimpleFloatProperty();

    /**
     * @param symbol
     * @param name
     * @param quantity
     * @param lastPrice
     * @param marketValue
     */
    public Investment(String symbol, String name, String quantity, String lastPrice, String marketValue) {
        this.symbol.set(symbol);
        this.name.set(name);
        this.quantity.setValue(Float.valueOf(quantity));
        this.lastPrice.setValue(Float.valueOf(lastPrice));
        this.marketValue.setValue(Float.valueOf(marketValue));
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol.get();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name.get();
    }

    /**
     * @return the lastPrice
     */
    public Float getLastPrice() {
        return lastPrice.get();
    }

    /**
     * @return the quantity
     */
    public Float getQuantity() {
        return quantity.get();
    }

    /**
     * @return the marketValue
     */
    public Float getMarketValue() {
        return marketValue.get();
    }

    /**
     * @return the percentage
     */
    public Float getPercentage() {
        return percentage.get();
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(Float percentage) {
        this.percentage.setValue(percentage);
    }
}
