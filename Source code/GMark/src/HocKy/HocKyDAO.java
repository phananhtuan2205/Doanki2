/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocKy;


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
public class HocKyDAO implements IHocKyDAO{

    @Override
    public ArrayList<HocKy> getAll() {
        ArrayList<HocKy> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select *from hocky");
                
                rs = ps.executeQuery();
                list = new ArrayList<HocKy>();
                while (rs.next()) {
                    HocKy o = new HocKy();
                    o.setMaHK(rs.getString("maHK"));
                    o.setTenHK(rs.getString("tenHK"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(HocKyDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public HocKy getByID(String maHK) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select *from hocky where maHK = ? ");
                ps.setString(1, maHK);
                rs = ps.executeQuery();
                
                while (rs.next()) {
                    HocKy o = new HocKy();
                    o.setMaHK(rs.getString("maHK"));
                    o.setTenHK(rs.getString("tenHK"));
                    
                    return o;
                }
            } catch (SQLException ex) {
                Logger.getLogger(HocKyDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return null;
    }

    
}
