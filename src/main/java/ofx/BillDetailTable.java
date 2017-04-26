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
 * 	      The OFX element "BILLDETAILTABLE" is of type "BillDetailTable"
 * 	    
 * 
 * <p>Java class for BillDetailTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillDetailTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TABLENAME" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *         &lt;element name="BILLDETAILTABLETYPE" type="{http://ofx.net/types/2003/04}GenericNameType"/>
 *         &lt;element name="BILLDETAILROW" type="{http://ofx.net/types/2003/04}BillDetailRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillDetailTable", propOrder = {
    "tablename",
    "billdetailtabletype",
    "billdetailrow"
})
public class BillDetailTable {

    @XmlElement(name = "TABLENAME", required = true)
    protected String tablename;
    @XmlElement(name = "BILLDETAILTABLETYPE", required = true)
    protected String billdetailtabletype;
    @XmlElement(name = "BILLDETAILROW")
    protected List<BillDetailRow> billdetailrow;

    /**
     * Gets the value of the tablename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTABLENAME() {
        return tablename;
    }

    /**
     * Sets the value of the tablename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTABLENAME(String value) {
        this.tablename = value;
    }

    /**
     * Gets the value of the billdetailtabletype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBILLDETAILTABLETYPE() {
        return billdetailtabletype;
    }

    /**
     * Sets the value of the billdetailtabletype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBILLDETAILTABLETYPE(String value) {
        this.billdetailtabletype = value;
    }

    /**
     * Gets the value of the billdetailrow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billdetailrow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBILLDETAILROW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillDetailRow }
     * 
     * 
     */
    public List<BillDetailRow> getBILLDETAILROW() {
        if (billdetailrow == null) {
            billdetailrow = new ArrayList<BillDetailRow>();
        }
        return this.billdetailrow;
    }

}
