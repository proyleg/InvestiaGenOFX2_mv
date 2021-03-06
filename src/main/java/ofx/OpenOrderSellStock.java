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
 *         The OFX element "OOSELLSTOCK" is of type "OpenOrderSellStock"
 *       
 * 
 * <p>Java class for OpenOrderSellStock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenOrderSellStock">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractOpenOrder">
 *       &lt;sequence>
 *         &lt;element name="SELLTYPE" type="{http://ofx.net/types/2003/04}SellTypeEnum"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenOrderSellStock", propOrder = {
    "selltype"
})
public class OpenOrderSellStock
    extends AbstractOpenOrder
{

    @XmlElement(name = "SELLTYPE", required = true)
    protected SellTypeEnum selltype;

    /**
     * Gets the value of the selltype property.
     * 
     * @return
     *     possible object is
     *     {@link SellTypeEnum }
     *     
     */
    public SellTypeEnum getSELLTYPE() {
        return selltype;
    }

    /**
     * Sets the value of the selltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellTypeEnum }
     *     
     */
    public void setSELLTYPE(SellTypeEnum value) {
        this.selltype = value;
    }

}
