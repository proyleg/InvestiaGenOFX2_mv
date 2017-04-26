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
 *               The OFX element "PMTMODRQ" is of type "PaymentModRequest"
 *             
 * 
 * <p>Java class for PaymentModRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentModRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractPaymentRequest">
 *       &lt;sequence>
 *         &lt;element name="SRVRTID" type="{http://ofx.net/types/2003/04}ServerIdType"/>
 *         &lt;element name="PMTINFO" type="{http://ofx.net/types/2003/04}PaymentInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentModRequest", propOrder = {
    "srvrtid",
    "pmtinfo"
})
public class PaymentModRequest
    extends AbstractPaymentRequest
{

    @XmlElement(name = "SRVRTID", required = true)
    protected String srvrtid;
    @XmlElement(name = "PMTINFO", required = true)
    protected PaymentInfo pmtinfo;

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

}
