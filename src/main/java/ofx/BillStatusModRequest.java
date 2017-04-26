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
 *         The OFX element "BILLSTATUSMODRQ" is of type "BillStatusModRequest"
 *       
 * 
 * <p>Java class for BillStatusModRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillStatusModRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLID" type="{http://ofx.net/types/2003/04}IdType" minOccurs="0"/>
 *         &lt;element name="BILLSTATUS" type="{http://ofx.net/types/2003/04}BillStatus" minOccurs="0"/>
 *         &lt;element name="BILLPMTSTATUS" type="{http://ofx.net/types/2003/04}BillPaymentstatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillStatusModRequest", propOrder = {
    "billid",
    "billstatus",
    "billpmtstatus"
})
public class BillStatusModRequest {

    @XmlElement(name = "BILLID")
    protected String billid;
    @XmlElement(name = "BILLSTATUS")
    protected BillStatus billstatus;
    @XmlElement(name = "BILLPMTSTATUS")
    protected BillPaymentstatus billpmtstatus;

    /**
     * Gets the value of the billid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLID() {
        return billid;
    }

    /**
     * Sets the value of the billid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLID(String value) {
        this.billid = value;
    }

    /**
     * Gets the value of the billstatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillStatus }
     *     
     */
    public BillStatus getBILLSTATUS() {
        return billstatus;
    }

    /**
     * Sets the value of the billstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillStatus }
     *     
     */
    public void setBILLSTATUS(BillStatus value) {
        this.billstatus = value;
    }

    /**
     * Gets the value of the billpmtstatus property.
     * 
     * @return
     *     possible object is
     *     {@link BillPaymentstatus }
     *     
     */
    public BillPaymentstatus getBILLPMTSTATUS() {
        return billpmtstatus;
    }

    /**
     * Sets the value of the billpmtstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillPaymentstatus }
     *     
     */
    public void setBILLPMTSTATUS(BillPaymentstatus value) {
        this.billpmtstatus = value;
    }

}
