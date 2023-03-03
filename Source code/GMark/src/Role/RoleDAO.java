/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBConnect;

/**
 *
 * @author TranHung
 */
public class RoleDAO implements IRoleDAO{

    @Override
    public ArrayList<Role> getAll() {
        ArrayList<Role> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select *from roles");
                rs = ps.executeQuery();
                list = new ArrayList<Role>();
                while (rs.next()) {
                    Role r = new Role();
                    r.setId(rs.getInt("id"));
                    r.setRole(rs.getString("role"));
                   
                    list.add(r);
                }
            } catch (SQLException ex) {
                Logger.getLogger(RoleDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public ArrayList<Role> getRole(int role_id) {
        ArrayList<Role> list = null;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.conn.prepareStatement("select *from roles where id = ?");
                psCheck.setInt(1, role_id);
                rs = psCheck.executeQuery();
                list = new ArrayList<Role>();
                while (rs.next()) {
                    Role o = new Role();
                    o.setRole(rs.getString("role"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(RoleDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                DBConnect.close(psCheck, rs);
            }
            
        }
        return list;
    }
    
}
