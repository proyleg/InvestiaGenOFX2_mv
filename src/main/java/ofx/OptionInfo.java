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
 *         The OFX element "OPTINFO" is of type "OptionInfo"
 *       
 * 
 * <p>Java class for OptionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractSecurityInfo">
 *       &lt;sequence>
 *         &lt;element name="OPTTYPE" type="{http://ofx.net/types/2003/04}OptionTypeEnum"/>
 *         &lt;element name="STRIKEPRICE" type="{http://ofx.net/types/2003/04}UnitPriceType"/>
 *         &lt;element name="DTEXPIRE" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;element name="SHPERCTRCT" type="{http://ofx.net/types/2003/04}SharesPerType"/>
 *         &lt;element name="SECID" type="{http://ofx.net/types/2003/04}SecurityId" minOccurs="0"/>
 *         &lt;element name="ASSETCLASS" type="{http://ofx.net/types/2003/04}AssetClassEnum" minOccurs="0"/>
 *         &lt;element name="FIASSETCLASS" type="{http://ofx.net/types/2003/04}GenericNameType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionInfo", propOrder = {
    "opttype",
    "strikeprice",
    "dtexpire",
    "shperctrct",
    "secid",
    "assetclass",
    "fiassetclass"
})
public class OptionInfo
    extends AbstractSecurityInfo
{

    @XmlElement(name = "OPTTYPE", required = true)
    protected OptionTypeEnum opttype;
    @XmlElement(name = "STRIKEPRICE", required = true)
    protected String strikeprice;
    @XmlElement(name = "DTEXPIRE", required = true)
    protected String dtexpire;
    @XmlElement(name = "SHPERCTRCT", required = true)
    protected String shperctrct;
    @XmlElement(name = "SECID")
    protected SecurityId secid;
    @XmlElement(name = "ASSETCLASS")
    protected AssetClassEnum assetclass;
    @XmlElement(name = "FIASSETCLASS")
    protected String fiassetclass;

    /**
     * Gets the value of the opttype property.
     * 
     * @return
     *     possible object is
     *     {@link OptionTypeEnum }
     *     
     */
    public OptionTypeEnum getOPTTYPE() {
        return opttype;
    }

    /**
     * Sets the value of the opttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionTypeEnum }
     *     
     */
    public void setOPTTYPE(OptionTypeEnum value) {
        this.opttype = value;
    }

    /**
     * Gets the value of the strikeprice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTRIKEPRICE() {
        return strikeprice;
    }

    /**
     * Sets the value of the strikeprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTRIKEPRICE(String value) {
        this.strikeprice = value;
    }

    /**
     * Gets the value of the dtexpire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTEXPIRE() {
        return dtexpire;
    }

    /**
     * Sets the value of the dtexpire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTEXPIRE(String value) {
        this.dtexpire = value;
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
     * Gets the value of the secid property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityId }
     *     
     */
    public SecurityId getSECID() {
        return secid;
    }

    /**
     * Sets the value of the secid property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityId }
     *     
     */
    public void setSECID(SecurityId value) {
        this.secid = value;
    }

    /**
     * Gets the value of the assetclass property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassEnum }
     *     
     */
    public AssetClassEnum getASSETCLASS() {
        return assetclass;
    }

    /**
     * Sets the value of the assetclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassEnum }
     *     
     */
    public void setASSETCLASS(AssetClassEnum value) {
        this.assetclass = value;
    }

    /**
     * Gets the value of the fiassetclass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIASSETCLASS() {
        return fiassetclass;
    }

    /**
     * Sets the value of the fiassetclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIASSETCLASS(String value) {
        this.fiassetclass = value;
    }

}
