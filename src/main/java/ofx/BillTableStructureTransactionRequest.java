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
 *         The OFX element "BILLTBLSTRUCTTRNRQ" is of type "BillTableStructureTransactionRequest"
 *       
 * 
 * <p>Java class for BillTableStructureTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillTableStructureTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionRequest">
 *       &lt;sequence>
 *         &lt;element name="BILLTBLSTRUCTRQ" type="{http://ofx.net/types/2003/04}BillTableStructureRequest"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillTableStructureTransactionRequest", propOrder = {
    "billtblstructrq"
})
public class BillTableStructureTransactionRequest
    extends AbstractTransactionRequest
{

    @XmlElement(name = "BILLTBLSTRUCTRQ", required = true)
    protected BillTableStructureRequest billtblstructrq;

    /**
     * Gets the value of the billtblstructrq property.
     * 
     * @return
     *     possible object is
     *     {@link BillTableStructureRequest }
     *     
     */
    public BillTableStructureRequest getBILLTBLSTRUCTRQ() {
        return billtblstructrq;
    }

    /**
     * Sets the value of the billtblstructrq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillTableStructureRequest }
     *     
     */
    public void setBILLTBLSTRUCTRQ(BillTableStructureRequest value) {
        this.billtblstructrq = value;
    }

}