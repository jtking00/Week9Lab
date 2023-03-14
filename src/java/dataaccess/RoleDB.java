package dataaccess;

import javax.persistence.*;
import java.util.*;
import models.Role;
/**
 * @author 882199
 */
public class RoleDB {
    public List<Role> getRoles() throws Exception{
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try{
            List<Role> roles = em.createNamedQuery("Role.findAll", Role.class).getResultList();
            return roles;
        } finally {
            em.close();
        }
    }
    public Role getRole(int roleId) throws Exception{
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try{
            Role curRole = em.find(Role.class, roleId);
            return curRole;
        } finally {
            em.close();
        }
        
    }
}
