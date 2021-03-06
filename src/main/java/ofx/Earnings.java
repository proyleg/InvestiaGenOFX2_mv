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
 * 	      The OFX element "EARNINGS" is of type "Earnings"
 * 	    
 * 
 * <p>Java class for Earnings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Earnings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRETAX" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="AFTERTAX" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="MATCH" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="PROFITSHARING" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="ROLLOVER" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="OTHERVEST" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="OTHERNONVEST" type="{http://ofx.net/types/2003/04}AmountType" minOccurs="0"/>
 *         &lt;element name="TOTAL" type="{http://ofx.net/types/2003/04}AmountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Earnings", propOrder = {
    "pretax",
    "aftertax",
    "match",
    "profitsharing",
    "rollover",
    "othervest",
    "othernonvest",
    "total"
})
public class Earnings {

    @XmlElement(name = "PRETAX")
    protected String pretax;
    @XmlElement(name = "AFTERTAX")
    protected String aftertax;
    @XmlElement(name = "MATCH")
    protected String match;
    @XmlElement(name = "PROFITSHARING")
    protected String profitsharing;
    @XmlElement(name = "ROLLOVER")
    protected String rollover;
    @XmlElement(name = "OTHERVEST")
    protected String othervest;
    @XmlElement(name = "OTHERNONVEST")
    protected String othernonvest;
    @XmlElement(name = "TOTAL", required = true)
    protected String total;

    /**
     * Gets the value of the pretax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRETAX() {
        return pretax;
    }

    /**
     * Sets the value of the pretax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRETAX(String value) {
        this.pretax = value;
    }

    /**
     * Gets the value of the aftertax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAFTERTAX() {
        return aftertax;
    }

    /**
     * Sets the value of the aftertax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAFTERTAX(String value) {
        this.aftertax = value;
    }

    /**
     * Gets the value of the match property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATCH() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATCH(String value) {
        this.match = value;
    }

    /**
     * Gets the value of the profitsharing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFITSHARING() {
        return profitsharing;
    }

    /**
     * Sets the value of the profitsharing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFITSHARING(String value) {
        this.profitsharing = value;
    }

    /**
     * Gets the value of the rollover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getROLLOVER() {
        return rollover;
    }

    /**
     * Sets the value of the rollover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setROLLOVER(String value) {
        this.rollover = value;
    }

    /**
     * Gets the value of the othervest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHERVEST() {
        return othervest;
    }

    /**
     * Sets the value of the othervest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHERVEST(String value) {
        this.othervest = value;
    }

    /**
     * Gets the value of the othernonvest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOTHERNONVEST() {
        return othernonvest;
    }

    /**
     * Sets the value of the othernonvest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOTHERNONVEST(String value) {
        this.othernonvest = value;
    }

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOTAL() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOTAL(String value) {
        this.total = value;
    }

}
