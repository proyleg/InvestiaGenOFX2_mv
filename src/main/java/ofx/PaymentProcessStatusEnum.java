//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.12.12 at 04:58:05 PM EST 
//


package ofx;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentProcessStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentProcessStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="CANCELEDON"/>
 *     &lt;enumeration value="WILLPROCESSON"/>
 *     &lt;enumeration value="PROCESSEDON"/>
 *     &lt;enumeration value="NOFUNDSON"/>
 *     &lt;enumeration value="FAILEDON"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentProcessStatusEnum")
@XmlEnum
public enum PaymentProcessStatusEnum {

    CANCELEDON,
    WILLPROCESSON,
    PROCESSEDON,
    NOFUNDSON,
    FAILEDON;

    public String value() {
        return name();
    }

    public static PaymentProcessStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
