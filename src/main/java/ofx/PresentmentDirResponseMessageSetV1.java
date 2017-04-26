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
 *         The OFX element "PRESDIRMSGSRSV1" is of type "PresentmentDirResponseMessageSetV1"
 *       
 * 
 * <p>Java class for PresentmentDirResponseMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentDirResponseMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractResponseMessageSet">
 *       &lt;sequence>
 *         &lt;element name="FINDBILLERTRNRS" type="{http://ofx.net/types/2003/04}FindBillerTransactionResponse"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentDirResponseMessageSetV1", propOrder = {
    "findbillertrnrs"
})
public class PresentmentDirResponseMessageSetV1
    extends AbstractResponseMessageSet
{

    @XmlElement(name = "FINDBILLERTRNRS", required = true)
    protected FindBillerTransactionResponse findbillertrnrs;

    /**
     * Gets the value of the findbillertrnrs property.
     * 
     * @return
     *     possible object is
     *     {@link FindBillerTransactionResponse }
     *     
     */
    public FindBillerTransactionResponse getFINDBILLERTRNRS() {
        return findbillertrnrs;
    }

    /**
     * Sets the value of the findbillertrnrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindBillerTransactionResponse }
     *     
     */
    public void setFINDBILLERTRNRS(FindBillerTransactionResponse value) {
        this.findbillertrnrs = value;
    }

}
