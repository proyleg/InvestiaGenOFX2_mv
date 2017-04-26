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
 *         The OFX element "INTRARS" is of type "IntraResponse"
 *       
 * 
 * <p>Java class for IntraResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntraResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ofx.net/types/2003/04}AbstractIntraResponse">
 *       &lt;sequence>
 *         &lt;element name="CURDEF" type="{http://ofx.net/types/2003/04}CurrencyEnum"/>
 *         &lt;element name="SRVRTID" type="{http://ofx.net/types/2003/04}ServerIdType"/>
 *         &lt;element name="XFERINFO" type="{http://ofx.net/types/2003/04}TransferInfo"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="DTXFERPRJ" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *           &lt;element name="DTPOSTED" type="{http://ofx.net/types/2003/04}DateTimeType"/>
 *         &lt;/choice>
 *         &lt;element name="RECSRVRTID" type="{http://ofx.net/types/2003/04}ServerIdType" minOccurs="0"/>
 *         &lt;element name="XFERPRCSTS" type="{http://ofx.net/types/2003/04}TransferProcessingStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraResponse", propOrder = {
    "curdef",
    "srvrtid",
    "xferinfo",
    "dtxferprj",
    "dtposted",
    "recsrvrtid",
    "xferprcsts"
})
public class IntraResponse
    extends AbstractIntraResponse
{

    @XmlElement(name = "CURDEF", required = true)
    protected CurrencyEnum curdef;
    @XmlElement(name = "SRVRTID", required = true)
    protected String srvrtid;
    @XmlElement(name = "XFERINFO", required = true)
    protected TransferInfo xferinfo;
    @XmlElement(name = "DTXFERPRJ")
    protected String dtxferprj;
    @XmlElement(name = "DTPOSTED")
    protected String dtposted;
    @XmlElement(name = "RECSRVRTID")
    protected String recsrvrtid;
    @XmlElement(name = "XFERPRCSTS")
    protected TransferProcessingStatus xferprcsts;

    /**
     * Gets the value of the curdef property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyEnum }
     *     
     */
    public CurrencyEnum getCURDEF() {
        return curdef;
    }

    /**
     * Sets the value of the curdef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyEnum }
     *     
     */
    public void setCURDEF(CurrencyEnum value) {
        this.curdef = value;
    }

    /**
     * Gets the value of the srvrtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVRTID() {
        return srvrtid;
    }

    /**
     * Sets the value of the srvrtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVRTID(String value) {
        this.srvrtid = value;
    }

    /**
     * Gets the value of the xferinfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransferInfo }
     *     
     */
    public TransferInfo getXFERINFO() {
        return xferinfo;
    }

    /**
     * Sets the value of the xferinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferInfo }
     *     
     */
    public void setXFERINFO(TransferInfo value) {
        this.xferinfo = value;
    }

    /**
     * Gets the value of the dtxferprj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTXFERPRJ() {
        return dtxferprj;
    }

    /**
     * Sets the value of the dtxferprj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTXFERPRJ(String value) {
        this.dtxferprj = value;
    }

    /**
     * Gets the value of the dtposted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTPOSTED() {
        return dtposted;
    }

    /**
     * Sets the value of the dtposted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTPOSTED(String value) {
        this.dtposted = value;
    }

    /**
     * Gets the value of the recsrvrtid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECSRVRTID() {
        return recsrvrtid;
    }

    /**
     * Sets the value of the recsrvrtid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECSRVRTID(String value) {
        this.recsrvrtid = value;
    }

    /**
     * Gets the value of the xferprcsts property.
     * 
     * @return
     *     possible object is
     *     {@link TransferProcessingStatus }
     *     
     */
    public TransferProcessingStatus getXFERPRCSTS() {
        return xferprcsts;
    }

    /**
     * Sets the value of the xferprcsts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferProcessingStatus }
     *     
     */
    public void setXFERPRCSTS(TransferProcessingStatus value) {
        this.xferprcsts = value;
    }

}
