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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractMessageSetVersion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMessageSetVersion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MSGSETCORE" type="{http://ofx.net/types/2003/04}MessageSetCore"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMessageSetVersion", propOrder = {
    "msgsetcore"
})
@XmlSeeAlso({
    TaxW2MessageSetV1 .class,
    InvestmentStatementMessageSetV1 .class,
    SignupMessageSetV1 .class,
    WireTransferMessageSetV1 .class,
    ProfileMessageSetV1 .class,
    Tax1099MessageSetV1 .class,
    BillPayMessageSetV1 .class,
    SecurityListMessageSetV1 .class,
    CreditcardMessageSetV1 .class,
    BankMessageSetV1 .class,
    SignonMessageSetV1 .class,
    Tax1098MessageSetV1 .class,
    PresentmentDirMessageSetV1 .class,
    InterTransferMessageSetV1 .class,
    PresentmentDlvMessageSetV1 .class,
    EmailMessageSetV1 .class
})
public abstract class AbstractMessageSetVersion {

    @XmlElement(name = "MSGSETCORE", required = true)
    protected MessageSetCore msgsetcore;

    /**
     * Gets the value of the msgsetcore property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSetCore }
     *     
     */
    public MessageSetCore getMSGSETCORE() {
        return msgsetcore;
    }

    /**
     * Sets the value of the msgsetcore property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSetCore }
     *     
     */
    public void setMSGSETCORE(MessageSetCore value) {
        this.msgsetcore = value;
    }

}
