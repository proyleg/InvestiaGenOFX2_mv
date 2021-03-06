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
 *         The OFX element "INVSTMTRQ" is of type "InvestmentStatementRequest"
 *       
 * 
 * <p>Java class for InvestmentStatementRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestmentStatementRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="INVACCTFROM" type="{http://ofx.net/types/2003/04}InvestmentAccount"/>
 *         &lt;element name="INCTRAN" type="{http://ofx.net/types/2003/04}IncTransaction"/>
 *         &lt;element name="INCOO" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="INCPOS" type="{http://ofx.net/types/2003/04}IncPosition"/>
 *         &lt;element name="INCBAL" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="INC401K" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *         &lt;element name="INC401KBAL" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentStatementRequest", propOrder = {
    "invacctfrom",
    "inctran",
    "incoo",
    "incpos",
    "incbal",
    "inc401K",
    "inc401KBAL"
})
public class InvestmentStatementRequest {

    @XmlElement(name = "INVACCTFROM", required = true)
    protected InvestmentAccount invacctfrom;
    @XmlElement(name = "INCTRAN", required = true)
    protected IncTransaction inctran;
    @XmlElement(name = "INCOO", required = true)
    protected BooleanType incoo;
    @XmlElement(name = "INCPOS", required = true)
    protected IncPosition incpos;
    @XmlElement(name = "INCBAL", required = true)
    protected BooleanType incbal;
    @XmlElement(name = "INC401K")
    protected BooleanType inc401K;
    @XmlElement(name = "INC401KBAL")
    protected BooleanType inc401KBAL;

    /**
     * Gets the value of the invacctfrom property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount }
     *     
     */
    public InvestmentAccount getINVACCTFROM() {
        return invacctfrom;
    }

    /**
     * Sets the value of the invacctfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount }
     *     
     */
    public void setINVACCTFROM(InvestmentAccount value) {
        this.invacctfrom = value;
    }

    /**
     * Gets the value of the inctran property.
     * 
     * @return
     *     possible object is
     *     {@link IncTransaction }
     *     
     */
    public IncTransaction getINCTRAN() {
        return inctran;
    }

    /**
     * Sets the value of the inctran property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncTransaction }
     *     
     */
    public void setINCTRAN(IncTransaction value) {
        this.inctran = value;
    }

    /**
     * Gets the value of the incoo property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINCOO() {
        return incoo;
    }

    /**
     * Sets the value of the incoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINCOO(BooleanType value) {
        this.incoo = value;
    }

    /**
     * Gets the value of the incpos property.
     * 
     * @return
     *     possible object is
     *     {@link IncPosition }
     *     
     */
    public IncPosition getINCPOS() {
        return incpos;
    }

    /**
     * Sets the value of the incpos property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncPosition }
     *     
     */
    public void setINCPOS(IncPosition value) {
        this.incpos = value;
    }

    /**
     * Gets the value of the incbal property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINCBAL() {
        return incbal;
    }

    /**
     * Sets the value of the incbal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINCBAL(BooleanType value) {
        this.incbal = value;
    }

    /**
     * Gets the value of the inc401K property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINC401K() {
        return inc401K;
    }

    /**
     * Sets the value of the inc401K property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINC401K(BooleanType value) {
        this.inc401K = value;
    }

    /**
     * Gets the value of the inc401KBAL property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINC401KBAL() {
        return inc401KBAL;
    }

    /**
     * Sets the value of the inc401KBAL property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINC401KBAL(BooleanType value) {
        this.inc401KBAL = value;
    }

}
