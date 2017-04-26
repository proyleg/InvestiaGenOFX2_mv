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
 *         The OFX element "RECPMTMODRS" is of type "RecurringPaymentModResponse"
 *       
 * 
 * <p>Java class for RecurringPaymentModResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringPaymentModResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractRecurringPaymentResponse">
 *       &lt;sequence>
 *         &lt;element name="RECURRINST" type="{http://ofx.net/types/2003/04}RecurringInstructions"/>
 *         &lt;element name="PMTINFO" type="{http://ofx.net/types/2003/04}PaymentInfo"/>
 *         &lt;element name="INITIALAMT" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="FINALAMT" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="MODPENDING" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringPaymentModResponse", propOrder = {
    "recurrinst",
    "pmtinfo",
    "initialamt",
    "finalamt",
    "modpending"
})
public class RecurringPaymentModResponse
    extends AbstractRecurringPaymentResponse
{

    @XmlElement(name = "RECURRINST", required = true)
    protected RecurringInstructions recurrinst;
    @XmlElement(name = "PMTINFO", required = true)
    protected PaymentInfo pmtinfo;
    @XmlElement(name = "INITIALAMT")
    protected String initialamt;
    @XmlElement(name = "FINALAMT")
    protected String finalamt;
    @XmlElement(name = "MODPENDING", required = true)
    protected BooleanType modpending;

    /**
     * Gets the value of the recurrinst property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringInstructions }
     *     
     */
    public RecurringInstructions getRECURRINST() {
        return recurrinst;
    }

    /**
     * Sets the value of the recurrinst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringInstructions }
     *     
     */
    public void setRECURRINST(RecurringInstructions value) {
        this.recurrinst = value;
    }

    /**
     * Gets the value of the pmtinfo property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfo }
     *     
     */
    public PaymentInfo getPMTINFO() {
        return pmtinfo;
    }

    /**
     * Sets the value of the pmtinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfo }
     *     
     */
    public void setPMTINFO(PaymentInfo value) {
        this.pmtinfo = value;
    }

    /**
     * Gets the value of the initialamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINITIALAMT() {
        return initialamt;
    }

    /**
     * Sets the value of the initialamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINITIALAMT(String value) {
        this.initialamt = value;
    }

    /**
     * Gets the value of the finalamt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINALAMT() {
        return finalamt;
    }

    /**
     * Sets the value of the finalamt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINALAMT(String value) {
        this.finalamt = value;
    }

    /**
     * Gets the value of the modpending property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getMODPENDING() {
        return modpending;
    }

    /**
     * Sets the value of the modpending property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setMODPENDING(BooleanType value) {
        this.modpending = value;
    }

}
