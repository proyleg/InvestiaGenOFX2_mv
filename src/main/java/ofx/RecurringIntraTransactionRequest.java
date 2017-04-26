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
 *         The OFX element "RECINTRATRNRQ" is of type "RecurringIntraTransactionRequest"
 *       
 * 
 * <p>Java class for RecurringIntraTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringIntraTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="RECINTRARQ" type="{http://ofx.net/types/2003/04}RecurringIntraRequest"/>
 *           &lt;element name="RECINTRAMODRQ" type="{http://ofx.net/types/2003/04}RecurringIntraModRequest"/>
 *           &lt;element name="RECINTRACANRQ" type="{http://ofx.net/types/2003/04}RecurringIntraCancellationRequest"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringIntraTransactionRequest", propOrder = {
    "recintrarq",
    "recintramodrq",
    "recintracanrq"
})
public class RecurringIntraTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "RECINTRARQ")
    protected RecurringIntraRequest recintrarq;
    @XmlElement(name = "RECINTRAMODRQ")
    protected RecurringIntraModRequest recintramodrq;
    @XmlElement(name = "RECINTRACANRQ")
    protected RecurringIntraCancellationRequest recintracanrq;

    /**
     * Gets the value of the recintrarq property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringIntraRequest }
     *     
     */
    public RecurringIntraRequest getRECINTRARQ() {
        return recintrarq;
    }

    /**
     * Sets the value of the recintrarq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringIntraRequest }
     *     
     */
    public void setRECINTRARQ(RecurringIntraRequest value) {
        this.recintrarq = value;
    }

    /**
     * Gets the value of the recintramodrq property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringIntraModRequest }
     *     
     */
    public RecurringIntraModRequest getRECINTRAMODRQ() {
        return recintramodrq;
    }

    /**
     * Sets the value of the recintramodrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringIntraModRequest }
     *     
     */
    public void setRECINTRAMODRQ(RecurringIntraModRequest value) {
        this.recintramodrq = value;
    }

    /**
     * Gets the value of the recintracanrq property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringIntraCancellationRequest }
     *     
     */
    public RecurringIntraCancellationRequest getRECINTRACANRQ() {
        return recintracanrq;
    }

    /**
     * Sets the value of the recintracanrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringIntraCancellationRequest }
     *     
     */
    public void setRECINTRACANRQ(RecurringIntraCancellationRequest value) {
        this.recintracanrq = value;
    }

}