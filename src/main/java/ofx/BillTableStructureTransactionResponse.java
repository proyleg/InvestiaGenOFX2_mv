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
 *         The OFX element "BILLTBLSTRUCTTRNRS" is of type "BillTableStructureTransactionResponse"
 *       
 * 
 * <p>Java class for BillTableStructureTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillTableStructureTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTransactionResponse">
 *       &lt;sequence>
 *         &lt;element name="BILLTBLSTRUCTRS" type="{http://ofx.net/types/2003/04}BillTableStructureResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillTableStructureTransactionResponse", propOrder = {
    "billtblstructrs"
})
public class BillTableStructureTransactionResponse
    extends AbstractTransactionResponse
{

    @XmlElement(name = "BILLTBLSTRUCTRS")
    protected BillTableStructureResponse billtblstructrs;

    /**
     * Gets the value of the billtblstructrs property.
     * 
     * @return
     *     possible object is
     *     {@link BillTableStructureResponse }
     *     
     */
    public BillTableStructureResponse getBILLTBLSTRUCTRS() {
        return billtblstructrs;
    }

    /**
     * Sets the value of the billtblstructrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillTableStructureResponse }
     *     
     */
    public void setBILLTBLSTRUCTRS(BillTableStructureResponse value) {
        this.billtblstructrs = value;
    }

}