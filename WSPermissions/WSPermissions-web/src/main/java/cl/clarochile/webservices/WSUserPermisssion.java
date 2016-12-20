/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile.webservices;

import cl.clarochile.UserPermissionSessionBean;
import cl.clarochile.webservices.userpermission.CreateUserPermission;
import cl.clarochile.webservices.userpermission.CreateUserPermissionResponse;
import cl.clarochile.webservices.userpermission.DeleteUserPermission;
import cl.clarochile.webservices.userpermission.DeleteUserPermissionResponse;
import cl.clarochile.webservices.userpermission.ListUserPermission;
import cl.clarochile.webservices.userpermission.ListUserPermissionResponse;
import cl.clarochile.webservices.userpermission.UpdateUserPermission;
import cl.clarochile.webservices.userpermission.UpdateUserPermissionResponse;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author luis
 * @url http://www.havasmedia.com
 */
@WebService(serviceName = "UserPermisssion",
        portName = "UserPermisssionSOAP",
        endpointInterface = "cl.clarochile.webservices.userpermission.UserPermission",
        targetNamespace = "http://www.clarochile.cl/webservices/UserPermission/",
        wsdlLocation = "WEB-INF/wsdl/UserPermission.wsdl")
public class WSUserPermisssion {

    @EJB(name = "java:ejb/UserPermissionSessionBean")
    private UserPermissionSessionBean userPermissionBean;

    public CreateUserPermissionResponse createUserPermission(CreateUserPermission usr) {
        return userPermissionBean.createUserPermission(usr);
    }

    public UpdateUserPermissionResponse updateUserPermission(UpdateUserPermission usr) {
        return userPermissionBean.updateUserPermission(usr);
    }

    public DeleteUserPermissionResponse deleteUserPermission(DeleteUserPermission user){
        return userPermissionBean.deleteUserPermission(user);
    }

    public ListUserPermissionResponse listUserPermission(ListUserPermission user){
        return userPermissionBean.lstUserPermission(user);
    }

}
