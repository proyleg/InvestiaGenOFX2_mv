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
 *         The OFX element "FIMFASSETCLASS" is of type "FinancialInstitutionMutualFundAssetClass"
 *       
 * 
 * <p>Java class for FinancialInstitutionMutualFundAssetClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstitutionMutualFundAssetClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FIPORTION" type="{http://ofx.net/types/2003/04}FinancialInstitutionPortion" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitutionMutualFundAssetClass", propOrder = {
    "fiportion"
})
public class FinancialInstitutionMutualFundAssetClass {

    @XmlElement(name = "FIPORTION", required = true)
    protected List<FinancialInstitutionPortion> fiportion;

    /**
     * Gets the value of the fiportion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fiportion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFIPORTION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstitutionPortion }
     * 
     * 
     */
    public List<FinancialInstitutionPortion> getFIPORTION() {
        if (fiportion == null) {
            fiportion = new ArrayList<FinancialInstitutionPortion>();
        }
        return this.fiportion;
    }

}