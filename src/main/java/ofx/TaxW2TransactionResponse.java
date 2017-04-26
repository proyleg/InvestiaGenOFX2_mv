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
 *         The OFX element "TAXW2TRNRS" is of type "TaxW2TransactionResponse"
 *       
 * 
 * <p>Java class for TaxW2TransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxW2TransactionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TRNUID" type="{http://ofx.net/types/2003/04}GloballyUniqueUserIdType"/>
 *         &lt;element name="STATUS" type="{http://ofx.net/types/2003/04}Status"/>
 *         &lt;element name="CLTCOOKIE" type="{http://ofx.net/types/2003/04}IdType" minOccurs="0"/>
 *         &lt;element name="TAXW2RS" type="{http://ofx.net/types/2003/04}TaxW2Response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxW2TransactionResponse", propOrder = {
    "trnuid",
    "status",
    "cltcookie",
    "taxw2RS"
})
public class TaxW2TransactionResponse {

    @XmlElement(name = "TRNUID", required = true)
    protected String trnuid;
    @XmlElement(name = "STATUS", required = true)
    protected Status status;
    @XmlElement(name = "CLTCOOKIE")
    protected String cltcookie;
    @XmlElement(name = "TAXW2RS")
    protected TaxW2Response taxw2RS;

    /**
     * Gets the value of the trnuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRNUID() {
        return trnuid;
    }

    /**
     * Sets the value of the trnuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRNUID(String value) {
        this.trnuid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getSTATUS() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setSTATUS(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the cltcookie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLTCOOKIE() {
        return cltcookie;
    }

    /**
     * Sets the value of the cltcookie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLTCOOKIE(String value) {
        this.cltcookie = value;
    }

    /**
     * Gets the value of the taxw2RS property.
     * 
     * @return
     *     possible object is
     *     {@link TaxW2Response }
     *     
     */
    public TaxW2Response getTAXW2RS() {
        return taxw2RS;
    }

    /**
     * Sets the value of the taxw2RS property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxW2Response }
     *     
     */
    public void setTAXW2RS(TaxW2Response value) {
        this.taxw2RS = value;
    }

}
