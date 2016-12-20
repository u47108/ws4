/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.clarochile;

import cl.clarochile.webservices.userpermission.CreateUserPermission;
import cl.clarochile.webservices.userpermission.CreateUserPermissionResponse;
import cl.clarochile.webservices.userpermission.DeleteUserPermission;
import cl.clarochile.webservices.userpermission.DeleteUserPermissionResponse;
import cl.clarochile.webservices.userpermission.ListUserPermission;
import cl.clarochile.webservices.userpermission.ListUserPermissionResponse;
import cl.clarochile.webservices.userpermission.UpdateUserPermission;
import cl.clarochile.webservices.userpermission.UpdateUserPermissionResponse;
import javax.ejb.Stateless;

/**
 *
 * @author luis
 */
@Stateless
public class UserPermissionSessionBean implements UserPermissionSessionBeanLocal {

    public CreateUserPermissionResponse createUserPermission(CreateUserPermission usr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UpdateUserPermissionResponse updateUserPermission(UpdateUserPermission usr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public DeleteUserPermissionResponse deleteUserPermission(DeleteUserPermission user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListUserPermissionResponse lstUserPermission(ListUserPermission user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
