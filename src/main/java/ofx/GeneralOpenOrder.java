//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "OO" is of type "GeneralOpenOrder"
 *       
 * 
 * <p>Java class for GeneralOpenOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralOpenOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FITID" type="{http://ofx.net/types/2003/04}FinancialInstitutionTransactionIdType"/>
 *         &lt;element name="SRVRTID" type="{http://ofx.net/types/2003/04}ServerIdType" minOccurs="0"/>
 *         &lt;element name="SECID" type="{http://ofx.net/types/2003/04}SecurityId"/>
 *         &lt;element name="DTPLACED" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="UNITS" type="{http://ofx.net/types/2003/04}QuantityType"/>
 *         &lt;element name="SUBACCT" type="{http://ofx.net/types/2003/04}SubAccountEnum"/>
 *         &lt;element name="DURATION" type="{http://ofx.net/types/2003/04}DurationEnum"/>
 *         &lt;element name="RESTRICTION" type="{http://ofx.net/types/2003/04}RestrictionEnum"/>
 *         &lt;element name="MINUNITS" type="{http://ofx.net/types/2003/04}QuantityType" minOccurs="0"/>
 *         &lt;element name="LIMITPRICE" type="{http://ofx.net/types/2003/04}UnitPriceType" minOccurs="0"/>
 *         &lt;element name="STOPPRICE" type="{http://ofx.net/types/2003/04}UnitPriceType" minOccurs="0"/>
 *         &lt;element name="MEMO" type="{http://ofx.net/types/2003/04}MessageType" minOccurs="0"/>
 *         &lt;element name="CURRENCY" type="{http://ofx.net/types/2003/04}Currency" minOccurs="0"/>
 *         &lt;element name="INV401KSOURCE" type="{http://ofx.net/types/2003/04}Investment401kSourceEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralOpenOrder", propOrder = {
    "fitid",
    "srvrtid",
    "secid",
    "dtplaced",
    "units",
    "subacct",
    "duration",
    "restriction",
    "minunits",
    "limitprice",
    "stopprice",
    "memo",
    "currency",
    "inv401KSOURCE"
})
public class GeneralOpenOrder {

    @XmlElement(name = "FITID", required = true)
    protected String fitid;
    @XmlElement(name = "SRVRTID")
    protected String srvrtid;
    @XmlElement(name = "SECID", required = true)
    protected SecurityId secid;
    @XmlElement(name = "DTPLACED", required = true)
    protected String dtplaced;
    @XmlElement(name = "UNITS", required = true)
    protected String units;
    @XmlElement(name = "SUBACCT", required = true)
    protected SubAccountEnum subacct;
    @XmlElement(name = "DURATION", required = true)
    protected DurationEnum duration;
    @XmlElement(name = "RESTRICTION", required = true)
    protected RestrictionEnum restriction;
    @XmlElement(name = "MINUNITS")
    protected String minunits;
    @XmlElement(name = "LIMITPRICE")
    protected String limitprice;
    @XmlElement(name = "STOPPRICE")
    protected String stopprice;
    @XmlElement(name = "MEMO")
    protected String memo;
    @XmlElement(name = "CURRENCY")
    protected Currency currency;
    @XmlElement(name = "INV401KSOURCE")
    protected Investment401KSourceEnum inv401KSOURCE;

    /**
     * Gets the value of the fitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFITID() {
        return fitid;
    }

    /**
     * Sets the value of the fitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFITID(String value) {
        this.fitid = value;
    }

    /**
     * Gets the value of the srvrtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVRTID() {
        return srvrtid;
    }

    /**
     * Sets the value of the srvrtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVRTID(String value) {
        this.srvrtid = value;
    }

    /**
     * Gets the value of the secid property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityId }
     *     
     */
    public SecurityId getSECID() {
        return secid;
    }

    /**
     * Sets the value of the secid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityId }
     *     
     */
    public void setSECID(SecurityId value) {
        this.secid = value;
    }

    /**
     * Gets the value of the dtplaced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTPLACED() {
        return dtplaced;
    }

    /**
     * Sets the value of the dtplaced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTPLACED(String value) {
        this.dtplaced = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITS() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITS(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the subacct property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccountEnum }
     *     
     */
    public SubAccountEnum getSUBACCT() {
        return subacct;
    }

    /**
     * Sets the value of the subacct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccountEnum }
     *     
     */
    public void setSUBACCT(SubAccountEnum value) {
        this.subacct = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationEnum }
     *     
     */
    public DurationEnum getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationEnum }
     *     
     */
    public void setDURATION(DurationEnum value) {
        this.duration = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionEnum }
     *     
     */
    public RestrictionEnum getRESTRICTION() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionEnum }
     *     
     */
    public void setRESTRICTION(RestrictionEnum value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the minunits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMINUNITS() {
        return minunits;
    }

    /**
     * Sets the value of the minunits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMINUNITS(String value) {
        this.minunits = value;
    }

    /**
     * Gets the value of the limitprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIMITPRICE() {
        return limitprice;
    }

    /**
     * Sets the value of the limitprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIMITPRICE(String value) {
        this.limitprice = value;
    }

    /**
     * Gets the value of the stopprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOPPRICE() {
        return stopprice;
    }

    /**
     * Sets the value of the stopprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOPPRICE(String value) {
        this.stopprice = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEMO() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEMO(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCURRENCY(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the inv401KSOURCE property.
     * 
     * @return
     *     possible object is
     *     {@link Investment401KSourceEnum }
     *     
     */
    public Investment401KSourceEnum getINV401KSOURCE() {
        return inv401KSOURCE;
    }

    /**
     * Sets the value of the inv401KSOURCE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Investment401KSourceEnum }
     *     
     */
    public void setINV401KSOURCE(Investment401KSourceEnum value) {
        this.inv401KSOURCE = value;
    }

}
