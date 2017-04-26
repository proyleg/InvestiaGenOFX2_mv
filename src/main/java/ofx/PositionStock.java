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
 *         The OFX element "POSSTOCK" is of type "PositionStock"
 *       
 * 
 * <p>Java class for PositionStock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PositionStock">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractPositionBase">
 *       &lt;sequence>
 *         &lt;element name="UNITSSTREET" type="{http://ofx.net/types/2003/04}PositiveQuantityType" minOccurs="0"/>
 *         &lt;element name="UNITSUSER" type="{http://ofx.net/types/2003/04}PositiveQuantityType" minOccurs="0"/>
 *         &lt;element name="REINVDIV" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionStock", propOrder = {
    "unitsstreet",
    "unitsuser",
    "reinvdiv"
})
public class PositionStock
    extends AbstractPositionBase
{

    @XmlElement(name = "UNITSSTREET")
    protected String unitsstreet;
    @XmlElement(name = "UNITSUSER")
    protected String unitsuser;
    @XmlElement(name = "REINVDIV")
    protected BooleanType reinvdiv;

    /**
     * Gets the value of the unitsstreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITSSTREET() {
        return unitsstreet;
    }

    /**
     * Sets the value of the unitsstreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITSSTREET(String value) {
        this.unitsstreet = value;
    }

    /**
     * Gets the value of the unitsuser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITSUSER() {
        return unitsuser;
    }

    /**
     * Sets the value of the unitsuser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITSUSER(String value) {
        this.unitsuser = value;
    }

    /**
     * Gets the value of the reinvdiv property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getREINVDIV() {
        return reinvdiv;
    }

    /**
     * Sets the value of the reinvdiv property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setREINVDIV(BooleanType value) {
        this.reinvdiv = value;
    }

}
