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
 *         The OFX element "RECINTRATRNRS" is of type "RecurringIntraTransactionResponse"
 *       
 * 
 * <p>Java class for RecurringIntraTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringIntraTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionResponse">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="RECINTRARS" type="{http://ofx.net/types/2003/04}RecurringIntraResponse"/>
 *           &lt;element name="RECINTRAMODRS" type="{http://ofx.net/types/2003/04}RecurringIntraModResponse"/>
 *           &lt;element name="RECINTRACANRS" type="{http://ofx.net/types/2003/04}RecurringIntraCancellationResponse"/>
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
@XmlType(name = "RecurringIntraTransactionResponse", propOrder = {
    "recintrars",
    "recintramodrs",
    "recintracanrs"
})
public class RecurringIntraTransactionResponse
    extends AbstractTransactionResponse
{

    @XmlElement(name = "RECINTRARS")
    protected RecurringIntraResponse recintrars;
    @XmlElement(name = "RECINTRAMODRS")
    protected RecurringIntraModResponse recintramodrs;
    @XmlElement(name = "RECINTRACANRS")
    protected RecurringIntraCancellationResponse recintracanrs;

    /**
     * Gets the value of the recintrars property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringIntraResponse }
     *     
     */
    public RecurringIntraResponse getRECINTRARS() {
        return recintrars;
    }

    /**
     * Sets the value of the recintrars property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringIntraResponse }
     *     
     */
    public void setRECINTRARS(RecurringIntraResponse value) {
        this.recintrars = value;
    }

    /**
     * Gets the value of the recintramodrs property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringIntraModResponse }
     *     
     */
    public RecurringIntraModResponse getRECINTRAMODRS() {
        return recintramodrs;
    }

    /**
     * Sets the value of the recintramodrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringIntraModResponse }
     *     
     */
    public void setRECINTRAMODRS(RecurringIntraModResponse value) {
        this.recintramodrs = value;
    }

    /**
     * Gets the value of the recintracanrs property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringIntraCancellationResponse }
     *     
     */
    public RecurringIntraCancellationResponse getRECINTRACANRS() {
        return recintracanrs;
    }

    /**
     * Sets the value of the recintracanrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringIntraCancellationResponse }
     *     
     */
    public void setRECINTRACANRS(RecurringIntraCancellationResponse value) {
        this.recintracanrs = value;
    }

}
