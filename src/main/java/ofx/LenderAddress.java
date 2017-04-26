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
 *         The OFX element "LENDERADDR" is of type "LenderAddress"
 *       
 * 
 * <p>Java class for LenderAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LenderAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LENDERNAME" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *         &lt;element name="ADDR1" type="{http://ofx.net/types/2003/04}AddressType" minOccurs="0"/>
 *         &lt;element name="ADDR2" type="{http://ofx.net/types/2003/04}AddressType" minOccurs="0"/>
 *         &lt;element name="ADDR3" type="{http://ofx.net/types/2003/04}AddressType" minOccurs="0"/>
 *         &lt;element name="CITY" type="{http://ofx.net/types/2003/04}AddressType" minOccurs="0"/>
 *         &lt;element name="STATE" type="{http://ofx.net/types/2003/04}StateType" minOccurs="0"/>
 *         &lt;element name="POSTALCODE" type="{http://ofx.net/types/2003/04}ZipType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LenderAddress", propOrder = {
    "lendername",
    "addr1",
    "addr2",
    "addr3",
    "city",
    "state",
    "postalcode"
})
public class LenderAddress {

    @XmlElement(name = "LENDERNAME", required = true)
    protected String lendername;
    @XmlElement(name = "ADDR1")
    protected String addr1;
    @XmlElement(name = "ADDR2")
    protected String addr2;
    @XmlElement(name = "ADDR3")
    protected String addr3;
    @XmlElement(name = "CITY")
    protected String city;
    @XmlElement(name = "STATE")
    protected String state;
    @XmlElement(name = "POSTALCODE")
    protected String postalcode;

    /**
     * Gets the value of the lendername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLENDERNAME() {
        return lendername;
    }

    /**
     * Sets the value of the lendername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLENDERNAME(String value) {
        this.lendername = value;
    }

    /**
     * Gets the value of the addr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDR1() {
        return addr1;
    }

    /**
     * Sets the value of the addr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDR1(String value) {
        this.addr1 = value;
    }

    /**
     * Gets the value of the addr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDR2() {
        return addr2;
    }

    /**
     * Sets the value of the addr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDR2(String value) {
        this.addr2 = value;
    }

    /**
     * Gets the value of the addr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADDR3() {
        return addr3;
    }

    /**
     * Sets the value of the addr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADDR3(String value) {
        this.addr3 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the postalcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTALCODE() {
        return postalcode;
    }

    /**
     * Sets the value of the postalcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTALCODE(String value) {
        this.postalcode = value;
    }

}
