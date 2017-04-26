//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "CREDITCARDMSGSRQV1" is of type "CreditcardRequestMessageSetV1"
 *       
 * 
 * <p>Java class for CreditcardRequestMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditcardRequestMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractRequestMessageSet">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="CCSTMTTRNRQ" type="{http://ofx.net/types/2003/04}CreditCardStatementTransactionRequest"/>
 *         &lt;element name="CCSTMTENDTRNRQ" type="{http://ofx.net/types/2003/04}CreditCardStatementEndTransactionRequest"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditcardRequestMessageSetV1", propOrder = {
    "ccstmttrnrqOrCCSTMTENDTRNRQ"
})
public class CreditcardRequestMessageSetV1
    extends AbstractRequestMessageSet
{

    @XmlElements({
        @XmlElement(name = "CCSTMTTRNRQ", type = CreditCardStatementTransactionRequest.class),
        @XmlElement(name = "CCSTMTENDTRNRQ", type = CreditCardStatementEndTransactionRequest.class)
    })
    protected List<AbstractTransactionRequest> ccstmttrnrqOrCCSTMTENDTRNRQ;

    /**
     * Gets the value of the ccstmttrnrqOrCCSTMTENDTRNRQ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccstmttrnrqOrCCSTMTENDTRNRQ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCSTMTTRNRQOrCCSTMTENDTRNRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardStatementTransactionRequest }
     * {@link CreditCardStatementEndTransactionRequest }
     * 
     * 
     */
    public List<AbstractTransactionRequest> getCCSTMTTRNRQOrCCSTMTENDTRNRQ() {
        if (ccstmttrnrqOrCCSTMTENDTRNRQ == null) {
            ccstmttrnrqOrCCSTMTENDTRNRQ = new ArrayList<AbstractTransactionRequest>();
        }
        return this.ccstmttrnrqOrCCSTMTENDTRNRQ;
    }

}