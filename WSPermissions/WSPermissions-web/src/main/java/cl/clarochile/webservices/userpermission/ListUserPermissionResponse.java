
package cl.clarochile.webservices.userpermission;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cl.clarochile.webservices.types.UserPermissionType;
import cl.clarochile.webservices.types.WebserviceStatusType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="status" type="{http://www.clarochile.cl/webservices/types/}WebserviceStatusType"/>
 *         &lt;element name="list" type="{http://www.clarochile.cl/webservices/types/}UserPermissionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "status",
    "list"
})
@XmlRootElement(name = "ListUserPermissionResponse")
public class ListUserPermissionResponse {

    protected WebserviceStatusType status;
    protected UserPermissionType list;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link WebserviceStatusType }
     *     
     */
    public WebserviceStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebserviceStatusType }
     *     
     */
    public void setStatus(WebserviceStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link UserPermissionType }
     *     
     */
    public UserPermissionType getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPermissionType }
     *     
     */
    public void setList(UserPermissionType value) {
        this.list = value;
    }

}
