package investiagenofx2.model;

import java.time.LocalDate;

/**
 * @author Pierre
 */
public class Transaction {

    private final LocalDate date;
    private final String type;
    private final String amount;
    private final String fitid;
    private final String symbol;
    private final String unit;
    private final String price;
    private final String unitBalance;

    /**
     * @param date
     * @param type
     * @param amount
     * @param fitid
     * @param symbol
     * @param unit
     * @param price
     * @param unitBalance
     */
    public Transaction(LocalDate date, String type, String amount, String fitid,
            String symbol, String unit, String price,String unitBalance) {
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.fitid = fitid;
        this.symbol = symbol;
        this.unit = unit;
        this.price = price;
        this.unitBalance = unitBalance;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @return the fitid
     */
    public String getFitid() {
        return fitid;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @return the unitBalance
     */
    public String getUnitBalance() {
        return unitBalance;
    }
}
