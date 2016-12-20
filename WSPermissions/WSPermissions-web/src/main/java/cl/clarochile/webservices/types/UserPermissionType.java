
package cl.clarochile.webservices.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserPermissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserPermissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="rutUser" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rutUserDelegate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="accessDashboard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="accessBilling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="labelProduct" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="delegateAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPermissionType", propOrder = {
    "id",
    "rutUser",
    "rutUserDelegate",
    "serviceId",
    "contractId",
    "accessDashboard",
    "accessBilling",
    "labelProduct",
    "email",
    "delegateAlias",
    "startDate",
    "updateDate"
})
public class UserPermissionType {

    protected long id;
    @XmlElement(required = true)
    protected String rutUser;
    @XmlElement(required = true)
    protected String rutUserDelegate;
    protected long serviceId;
    protected long contractId;
    protected int accessDashboard;
    protected int accessBilling;
    @XmlElement(required = true)
    protected String labelProduct;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String delegateAlias;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the rutUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutUser() {
        return rutUser;
    }

    /**
     * Sets the value of the rutUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutUser(String value) {
        this.rutUser = value;
    }

    /**
     * Gets the value of the rutUserDelegate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRutUserDelegate() {
        return rutUserDelegate;
    }

    /**
     * Sets the value of the rutUserDelegate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRutUserDelegate(String value) {
        this.rutUserDelegate = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     */
    public long getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     */
    public void setServiceId(long value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     */
    public long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the accessDashboard property.
     * 
     */
    public int getAccessDashboard() {
        return accessDashboard;
    }

    /**
     * Sets the value of the accessDashboard property.
     * 
     */
    public void setAccessDashboard(int value) {
        this.accessDashboard = value;
    }

    /**
     * Gets the value of the accessBilling property.
     * 
     */
    public int getAccessBilling() {
        return accessBilling;
    }

    /**
     * Sets the value of the accessBilling property.
     * 
     */
    public void setAccessBilling(int value) {
        this.accessBilling = value;
    }

    /**
     * Gets the value of the labelProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelProduct() {
        return labelProduct;
    }

    /**
     * Sets the value of the labelProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelProduct(String value) {
        this.labelProduct = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the delegateAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegateAlias() {
        return delegateAlias;
    }

    /**
     * Sets the value of the delegateAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegateAlias(String value) {
        this.delegateAlias = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

}
