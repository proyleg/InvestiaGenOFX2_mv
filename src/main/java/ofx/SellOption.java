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
 *         The OFX element "SELLOPT" is of type "SellOption"
 *       
 * 
 * <p>Java class for SellOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellOption">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractInvestmentSellTransaction">
 *       &lt;sequence>
 *         &lt;element name="OPTSELLTYPE" type="{http://ofx.net/types/2003/04}OptionSellEnum"/>
 *         &lt;element name="SHPERCTRCT" type="{http://ofx.net/types/2003/04}SharesPerType"/>
 *         &lt;element name="RELFITID" type="{http://ofx.net/types/2003/04}FinancialInstitutionTransactionIdType" minOccurs="0"/>
 *         &lt;element name="RELTYPE" type="{http://ofx.net/types/2003/04}RelatedEnum" minOccurs="0"/>
 *         &lt;element name="SECURED" type="{http://ofx.net/types/2003/04}SecuredEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellOption", propOrder = {
    "optselltype",
    "shperctrct",
    "relfitid",
    "reltype",
    "secured"
})
public class SellOption
    extends AbstractInvestmentSellTransaction
{

    @XmlElement(name = "OPTSELLTYPE", required = true)
    protected OptionSellEnum optselltype;
    @XmlElement(name = "SHPERCTRCT", required = true)
    protected String shperctrct;
    @XmlElement(name = "RELFITID")
    protected String relfitid;
    @XmlElement(name = "RELTYPE")
    protected RelatedEnum reltype;
    @XmlElement(name = "SECURED")
    protected SecuredEnum secured;

    /**
     * Gets the value of the optselltype property.
     * 
     * @return
     *     possible object is
     *     {@link OptionSellEnum }
     *     
     */
    public OptionSellEnum getOPTSELLTYPE() {
        return optselltype;
    }

    /**
     * Sets the value of the optselltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionSellEnum }
     *     
     */
    public void setOPTSELLTYPE(OptionSellEnum value) {
        this.optselltype = value;
    }

    /**
     * Gets the value of the shperctrct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHPERCTRCT() {
        return shperctrct;
    }

    /**
     * Sets the value of the shperctrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHPERCTRCT(String value) {
        this.shperctrct = value;
    }

    /**
     * Gets the value of the relfitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRELFITID() {
        return relfitid;
    }

    /**
     * Sets the value of the relfitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRELFITID(String value) {
        this.relfitid = value;
    }

    /**
     * Gets the value of the reltype property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedEnum }
     *     
     */
    public RelatedEnum getRELTYPE() {
        return reltype;
    }

    /**
     * Sets the value of the reltype property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedEnum }
     *     
     */
    public void setRELTYPE(RelatedEnum value) {
        this.reltype = value;
    }

    /**
     * Gets the value of the secured property.
     * 
     * @return
     *     possible object is
     *     {@link SecuredEnum }
     *     
     */
    public SecuredEnum getSECURED() {
        return secured;
    }

    /**
     * Sets the value of the secured property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuredEnum }
     *     
     */
    public void setSECURED(SecuredEnum value) {
        this.secured = value;
    }

}
