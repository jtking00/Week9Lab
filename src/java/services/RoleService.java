package services;

import java.util.*;
import dataaccess.RoleDB;
import models.Role;
/**
 * @author 882199
 */
public class RoleService {
    public Role getRole(int id) throws Exception {
        RoleDB roleDB = new RoleDB();
        Role curRole = roleDB.getRole(id);
        return curRole;
    }
    public ArrayList<Role> getRoles() throws Exception {
        RoleDB roleDB = new RoleDB();
        ArrayList<Role> roles = roleDB.getRoles();
        return roles;
    }
}
