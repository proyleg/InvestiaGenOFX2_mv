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
 *         The OFX element "WIRERQ" is of type "WireRequest"
 *       
 * 
 * <p>Java class for WireRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WireRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractWireRequest">
 *       &lt;sequence>
 *         &lt;element name="BANKACCTFROM" type="{http://ofx.net/types/2003/04}BankAccount"/>
 *         &lt;element name="WIREBENEFICIARY" type="{http://ofx.net/types/2003/04}WireBeneficiary"/>
 *         &lt;element name="WIREDESTBANK" type="{http://ofx.net/types/2003/04}WireDestinationBank" minOccurs="0"/>
 *         &lt;element name="TRNAMT" type="{http://ofx.net/types/2003/04}AmountType"/>
 *         &lt;element name="DTDUE" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PAYINSTRUCT" type="{http://ofx.net/types/2003/04}MessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WireRequest", propOrder = {
    "bankacctfrom",
    "wirebeneficiary",
    "wiredestbank",
    "trnamt",
    "dtdue",
    "payinstruct"
})
public class WireRequest
    extends AbstractWireRequest
{

    @XmlElement(name = "BANKACCTFROM", required = true)
    protected BankAccount bankacctfrom;
    @XmlElement(name = "WIREBENEFICIARY", required = true)
    protected WireBeneficiary wirebeneficiary;
    @XmlElement(name = "WIREDESTBANK")
    protected WireDestinationBank wiredestbank;
    @XmlElement(name = "TRNAMT", required = true)
    protected String trnamt;
    @XmlElement(name = "DTDUE")
    protected String dtdue;
    @XmlElement(name = "PAYINSTRUCT")
    protected String payinstruct;

    /**
     * Gets the value of the bankacctfrom property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccount }
     *     
     */
    public BankAccount getBANKACCTFROM() {
        return bankacctfrom;
    }

    /**
     * Sets the value of the bankacctfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccount }
     *     
     */
    public void setBANKACCTFROM(BankAccount value) {
        this.bankacctfrom = value;
    }

    /**
     * Gets the value of the wirebeneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link WireBeneficiary }
     *     
     */
    public WireBeneficiary getWIREBENEFICIARY() {
        return wirebeneficiary;
    }

    /**
     * Sets the value of the wirebeneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireBeneficiary }
     *     
     */
    public void setWIREBENEFICIARY(WireBeneficiary value) {
        this.wirebeneficiary = value;
    }

    /**
     * Gets the value of the wiredestbank property.
     * 
     * @return
     *     possible object is
     *     {@link WireDestinationBank }
     *     
     */
    public WireDestinationBank getWIREDESTBANK() {
        return wiredestbank;
    }

    /**
     * Sets the value of the wiredestbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link WireDestinationBank }
     *     
     */
    public void setWIREDESTBANK(WireDestinationBank value) {
        this.wiredestbank = value;
    }

    /**
     * Gets the value of the trnamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNAMT() {
        return trnamt;
    }

    /**
     * Sets the value of the trnamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNAMT(String value) {
        this.trnamt = value;
    }

    /**
     * Gets the value of the dtdue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTDUE() {
        return dtdue;
    }

    /**
     * Sets the value of the dtdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTDUE(String value) {
        this.dtdue = value;
    }

    /**
     * Gets the value of the payinstruct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYINSTRUCT() {
        return payinstruct;
    }

    /**
     * Sets the value of the payinstruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYINSTRUCT(String value) {
        this.payinstruct = value;
    }

}
