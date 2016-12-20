
package cl.clarochile.webservices.userpermission;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cl.clarochile.webservices.types.UserPermissionType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userPermission" type="{http://www.clarochile.cl/webservices/types/}UserPermissionType"/>
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
    "userPermission"
})
@XmlRootElement(name = "DeleteUserPermission")
public class DeleteUserPermission {

    @XmlElement(required = true)
    protected UserPermissionType userPermission;

    /**
     * Gets the value of the userPermission property.
     * 
     * @return
     *     possible object is
     *     {@link UserPermissionType }
     *     
     */
    public UserPermissionType getUserPermission() {
        return userPermission;
    }

    /**
     * Sets the value of the userPermission property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPermissionType }
     *     
     */
    public void setUserPermission(UserPermissionType value) {
        this.userPermission = value;
    }

}
