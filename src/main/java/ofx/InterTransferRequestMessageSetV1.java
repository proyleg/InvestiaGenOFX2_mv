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
 *         The OFX element "INTERXFERMSGSRQV1" is of type "InterTransferRequestMessageSetV1"
 *       
 * 
 * <p>Java class for InterTransferRequestMessageSetV1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterTransferRequestMessageSetV1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractRequestMessageSet">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="INTERTRNRQ" type="{http://ofx.net/types/2003/04}InterTransactionRequest"/>
 *         &lt;element name="RECINTERTRNRQ" type="{http://ofx.net/types/2003/04}RecurringInterTransactionRequest"/>
 *         &lt;element name="INTERSYNCRQ" type="{http://ofx.net/types/2003/04}InterSyncRequest"/>
 *         &lt;element name="RECINTERSYNCRQ" type="{http://ofx.net/types/2003/04}RecurringInterSyncRequest"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterTransferRequestMessageSetV1", propOrder = {
    "intertrnrqOrRECINTERTRNRQOrINTERSYNCRQ"
})
public class InterTransferRequestMessageSetV1
    extends AbstractRequestMessageSet
{

    @XmlElements({
        @XmlElement(name = "INTERTRNRQ", type = InterTransactionRequest.class),
        @XmlElement(name = "RECINTERTRNRQ", type = RecurringInterTransactionRequest.class),
        @XmlElement(name = "INTERSYNCRQ", type = InterSyncRequest.class),
        @XmlElement(name = "RECINTERSYNCRQ", type = RecurringInterSyncRequest.class)
    })
    protected List<AbstractRequest> intertrnrqOrRECINTERTRNRQOrINTERSYNCRQ;

    /**
     * Gets the value of the intertrnrqOrRECINTERTRNRQOrINTERSYNCRQ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intertrnrqOrRECINTERTRNRQOrINTERSYNCRQ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getINTERTRNRQOrRECINTERTRNRQOrINTERSYNCRQ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterTransactionRequest }
     * {@link RecurringInterTransactionRequest }
     * {@link InterSyncRequest }
     * {@link RecurringInterSyncRequest }
     * 
     * 
     */
    public List<AbstractRequest> getINTERTRNRQOrRECINTERTRNRQOrINTERSYNCRQ() {
        if (intertrnrqOrRECINTERTRNRQOrINTERSYNCRQ == null) {
            intertrnrqOrRECINTERTRNRQOrINTERSYNCRQ = new ArrayList<AbstractRequest>();
        }
        return this.intertrnrqOrRECINTERTRNRQOrINTERSYNCRQ;
    }

}
