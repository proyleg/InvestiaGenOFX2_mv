//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AbstractResponseMessageSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractResponseMessageSet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractTopLevelMessageSet">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractResponseMessageSet")
@XmlSeeAlso({
    SignonResponseMessageSetV1 .class,
    InvestmentStatementResponseMessageSetV1 .class,
    InterTransferResponseMessageSetV1 .class,
    SecurityListResponseMessageSetV1 .class,
    BankResponseMessageSetV1 .class,
    TaxW2ResponseMessageSetV1 .class,
    WireTransferResponseMessageSetV1 .class,
    CreditcardResponseMessageSetV1 .class,
    EmailResponseMessageSetV1 .class,
    ProfileResponseMessageSetV1 .class,
    Tax1098ResponseMessageSetV1 .class,
    Tax1099ResponseMessageSetV1 .class,
    BillPayResponseMessageSetV1 .class,
    PresentmentDeliveryResponseMessageSetV1 .class,
    PresentmentDirResponseMessageSetV1 .class,
    SignupResponseMessageSetV1 .class
})
public abstract class AbstractResponseMessageSet
    extends AbstractTopLevelMessageSet
{


}
