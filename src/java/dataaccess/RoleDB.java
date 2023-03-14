package dataaccess;

import java.sql.*;
import java.util.*;
import models.Role;
/**
 * @author 882199
 */
public class RoleDB {
    public ArrayList<Role> getRoles() throws Exception{
        ArrayList<Role> roles = new ArrayList<>();
        ConnectionPool cp = ConnectionPool.getInstance();
        Connection con = cp.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String sql = "SELECT * FROM role";
        
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int roleId = rs.getInt(1);
                String roleName = rs.getString(2);
                Role role = new Role(roleId,roleName);
                roles.add(role);
            }
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            cp.freeConnection(con);
        }
        return roles;
    }
    public Role getRole(int roleId) throws Exception{
        Role curRole = null;
        ConnectionPool cp = ConnectionPool.getInstance();
        Connection con = cp.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String sql = "SELECT * FROM role WHERE roleId=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, roleId);
            rs = ps.executeQuery();
            if(rs.next()){
                String roleName = rs.getString(2);
                curRole = new Role(roleId,roleName);
            }
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            cp.freeConnection(con);
        }
        return curRole;
    }
}
