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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         The OFX element "PRESLISTRQ" is of type "PresentmentListRequest"
 *       
 * 
 * <p>Java class for PresentmentListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentmentListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BILLPUB" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *         &lt;element name="DTSTART" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DTEND" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="DTDUEBY" type="{http://ofx.net/types/2003/04}DateTimeType" minOccurs="0"/>
 *         &lt;element name="BILLERID" type="{http://ofx.net/types/2003/04}IdType" minOccurs="0"/>
 *         &lt;element name="BILLID" type="{http://ofx.net/types/2003/04}IdType" minOccurs="0"/>
 *         &lt;element name="BILLTYPE" type="{http://ofx.net/types/2003/04}BillTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BILLSTATUSCODE" type="{http://ofx.net/types/2003/04}BillStatusCodeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BILLPMTSTATUSCODE" type="{http://ofx.net/types/2003/04}BillPaymentstatusCodeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NOTIFYWILLING" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="INCLUDEDETAIL" type="{http://ofx.net/types/2003/04}BooleanType"/>
 *         &lt;element name="INCLUDEBILLSTATUS" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *         &lt;element name="INCLUDEBILLPMTSTATUS" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *         &lt;element name="INCLUDESTATUSHIST" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *         &lt;element name="INCLUDECOUNTS" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *         &lt;element name="INCLUDESUMMARY" type="{http://ofx.net/types/2003/04}BooleanType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentmentListRequest", propOrder = {
    "billpub",
    "dtstart",
    "dtend",
    "dtdueby",
    "billerid",
    "billid",
    "billtype",
    "billstatuscode",
    "billpmtstatuscode",
    "notifywilling",
    "includedetail",
    "includebillstatus",
    "includebillpmtstatus",
    "includestatushist",
    "includecounts",
    "includesummary"
})
public class PresentmentListRequest {

    @XmlElement(name = "BILLPUB", required = true)
    protected String billpub;
    @XmlElement(name = "DTSTART")
    protected String dtstart;
    @XmlElement(name = "DTEND")
    protected String dtend;
    @XmlElement(name = "DTDUEBY")
    protected String dtdueby;
    @XmlElement(name = "BILLERID")
    protected String billerid;
    @XmlElement(name = "BILLID")
    protected String billid;
    @XmlElement(name = "BILLTYPE")
    protected List<BillTypeEnum> billtype;
    @XmlElement(name = "BILLSTATUSCODE")
    protected List<BillStatusCodeEnum> billstatuscode;
    @XmlElement(name = "BILLPMTSTATUSCODE")
    protected List<BillPaymentstatusCodeEnum> billpmtstatuscode;
    @XmlElement(name = "NOTIFYWILLING", required = true)
    protected BooleanType notifywilling;
    @XmlElement(name = "INCLUDEDETAIL", required = true)
    protected BooleanType includedetail;
    @XmlElement(name = "INCLUDEBILLSTATUS")
    protected BooleanType includebillstatus;
    @XmlElement(name = "INCLUDEBILLPMTSTATUS")
    protected BooleanType includebillpmtstatus;
    @XmlElement(name = "INCLUDESTATUSHIST")
    protected BooleanType includestatushist;
    @XmlElement(name = "INCLUDECOUNTS")
    protected BooleanType includecounts;
    @XmlElement(name = "INCLUDESUMMARY")
    protected BooleanType includesummary;

    /**
     * Gets the value of the billpub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLPUB() {
        return billpub;
    }

    /**
     * Sets the value of the billpub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLPUB(String value) {
        this.billpub = value;
    }

    /**
     * Gets the value of the dtstart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTSTART() {
        return dtstart;
    }

    /**
     * Sets the value of the dtstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTSTART(String value) {
        this.dtstart = value;
    }

    /**
     * Gets the value of the dtend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTEND() {
        return dtend;
    }

    /**
     * Sets the value of the dtend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTEND(String value) {
        this.dtend = value;
    }

    /**
     * Gets the value of the dtdueby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDTDUEBY() {
        return dtdueby;
    }

    /**
     * Sets the value of the dtdueby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDTDUEBY(String value) {
        this.dtdueby = value;
    }

    /**
     * Gets the value of the billerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLERID() {
        return billerid;
    }

    /**
     * Sets the value of the billerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLERID(String value) {
        this.billerid = value;
    }

    /**
     * Gets the value of the billid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLID() {
        return billid;
    }

    /**
     * Sets the value of the billid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLID(String value) {
        this.billid = value;
    }

    /**
     * Gets the value of the billtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBILLTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillTypeEnum }
     * 
     * 
     */
    public List<BillTypeEnum> getBILLTYPE() {
        if (billtype == null) {
            billtype = new ArrayList<BillTypeEnum>();
        }
        return this.billtype;
    }

    /**
     * Gets the value of the billstatuscode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billstatuscode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBILLSTATUSCODE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillStatusCodeEnum }
     * 
     * 
     */
    public List<BillStatusCodeEnum> getBILLSTATUSCODE() {
        if (billstatuscode == null) {
            billstatuscode = new ArrayList<BillStatusCodeEnum>();
        }
        return this.billstatuscode;
    }

    /**
     * Gets the value of the billpmtstatuscode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billpmtstatuscode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBILLPMTSTATUSCODE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillPaymentstatusCodeEnum }
     * 
     * 
     */
    public List<BillPaymentstatusCodeEnum> getBILLPMTSTATUSCODE() {
        if (billpmtstatuscode == null) {
            billpmtstatuscode = new ArrayList<BillPaymentstatusCodeEnum>();
        }
        return this.billpmtstatuscode;
    }

    /**
     * Gets the value of the notifywilling property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getNOTIFYWILLING() {
        return notifywilling;
    }

    /**
     * Sets the value of the notifywilling property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setNOTIFYWILLING(BooleanType value) {
        this.notifywilling = value;
    }

    /**
     * Gets the value of the includedetail property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINCLUDEDETAIL() {
        return includedetail;
    }

    /**
     * Sets the value of the includedetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINCLUDEDETAIL(BooleanType value) {
        this.includedetail = value;
    }

    /**
     * Gets the value of the includebillstatus property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINCLUDEBILLSTATUS() {
        return includebillstatus;
    }

    /**
     * Sets the value of the includebillstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINCLUDEBILLSTATUS(BooleanType value) {
        this.includebillstatus = value;
    }

    /**
     * Gets the value of the includebillpmtstatus property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINCLUDEBILLPMTSTATUS() {
        return includebillpmtstatus;
    }

    /**
     * Sets the value of the includebillpmtstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINCLUDEBILLPMTSTATUS(BooleanType value) {
        this.includebillpmtstatus = value;
    }

    /**
     * Gets the value of the includestatushist property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINCLUDESTATUSHIST() {
        return includestatushist;
    }

    /**
     * Sets the value of the includestatushist property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINCLUDESTATUSHIST(BooleanType value) {
        this.includestatushist = value;
    }

    /**
     * Gets the value of the includecounts property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINCLUDECOUNTS() {
        return includecounts;
    }

    /**
     * Sets the value of the includecounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINCLUDECOUNTS(BooleanType value) {
        this.includecounts = value;
    }

    /**
     * Gets the value of the includesummary property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanType }
     *     
     */
    public BooleanType getINCLUDESUMMARY() {
        return includesummary;
    }

    /**
     * Sets the value of the includesummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanType }
     *     
     */
    public void setINCLUDESUMMARY(BooleanType value) {
        this.includesummary = value;
    }

}
