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
import javax.ejb.Local;

/**
 *
 * @author luis
 */
@Local
public interface UserPermissionSessionBeanLocal {

    public CreateUserPermissionResponse createUserPermission(CreateUserPermission usr);

    public UpdateUserPermissionResponse updateUserPermission(UpdateUserPermission usr);

    public DeleteUserPermissionResponse deleteUserPermission(DeleteUserPermission user);

    public ListUserPermissionResponse lstUserPermission(ListUserPermission user);

}
