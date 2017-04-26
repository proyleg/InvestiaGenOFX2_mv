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
 *         The OFX element "RETOFCAP" is of type "ReturnOfCapital"
 *       
 * 
 * <p>Java class for ReturnOfCapital complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnOfCapital">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractInvestmentTransaction">
 *       &lt;sequence>
 *         &lt;element name="SECID" type="{http://ofx.net/types/2003/04}SecurityId"/>
 *         &lt;element name="TOTAL" type="{http://ofx.net/types/2003/04}AmountType"/>
 *         &lt;element name="SUBACCTSEC" type="{http://ofx.net/types/2003/04}SubAccountEnum"/>
 *         &lt;element name="SUBACCTFUND" type="{http://ofx.net/types/2003/04}SubAccountEnum"/>
 *         &lt;element name="CURRENCY" type="{http://ofx.net/types/2003/04}Currency" minOccurs="0"/>
 *         &lt;element name="ORIGCURRENCY" type="{http://ofx.net/types/2003/04}Currency" minOccurs="0"/>
 *         &lt;element name="INV401KSOURCE" type="{http://ofx.net/types/2003/04}Investment401kSourceEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnOfCapital", propOrder = {
    "secid",
    "total",
    "subacctsec",
    "subacctfund",
    "currency",
    "origcurrency",
    "inv401KSOURCE"
})
public class ReturnOfCapital
    extends AbstractInvestmentTransaction
{

    @XmlElement(name = "SECID", required = true)
    protected SecurityId secid;
    @XmlElement(name = "TOTAL", required = true)
    protected String total;
    @XmlElement(name = "SUBACCTSEC", required = true)
    protected SubAccountEnum subacctsec;
    @XmlElement(name = "SUBACCTFUND", required = true)
    protected SubAccountEnum subacctfund;
    @XmlElement(name = "CURRENCY")
    protected Currency currency;
    @XmlElement(name = "ORIGCURRENCY")
    protected Currency origcurrency;
    @XmlElement(name = "INV401KSOURCE")
    protected Investment401KSourceEnum inv401KSOURCE;

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
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTAL() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTAL(String value) {
        this.total = value;
    }

    /**
     * Gets the value of the subacctsec property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccountEnum }
     *     
     */
    public SubAccountEnum getSUBACCTSEC() {
        return subacctsec;
    }

    /**
     * Sets the value of the subacctsec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccountEnum }
     *     
     */
    public void setSUBACCTSEC(SubAccountEnum value) {
        this.subacctsec = value;
    }

    /**
     * Gets the value of the subacctfund property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccountEnum }
     *     
     */
    public SubAccountEnum getSUBACCTFUND() {
        return subacctfund;
    }

    /**
     * Sets the value of the subacctfund property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccountEnum }
     *     
     */
    public void setSUBACCTFUND(SubAccountEnum value) {
        this.subacctfund = value;
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
     * Gets the value of the origcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getORIGCURRENCY() {
        return origcurrency;
    }

    /**
     * Sets the value of the origcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setORIGCURRENCY(Currency value) {
        this.origcurrency = value;
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
