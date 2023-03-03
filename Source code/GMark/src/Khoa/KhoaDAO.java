/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Khoa;

import utils.DBConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anonymous
 */
public class KhoaDAO implements IKhoaDAO {

    @Override
    public ArrayList<Khoa> search(String s) {
        ArrayList<Khoa> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select *from khoa where maKH or tenKH like ? ");
                
                ps.setString(1, "%"+s+"%");
                        
                rs = ps.executeQuery();
                list = new ArrayList<Khoa>();
                while (rs.next()) {
                    Khoa o = new Khoa();
                    o.setMakhoa(rs.getString(1));
                    o.setTenkhoa(rs.getString(2));
                    o.setSdt(rs.getString(3));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public Khoa addNew(Khoa khoa) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("INSERT INTO khoa(maKH , tenKH , lienheKH , created_at , updated_at) values (?,?,?,?,?)");
                ps.setString(1, khoa.getMakhoa());
                ps.setString(2, khoa.getTenkhoa());
                ps.setString(3, khoa.getSdt());
                ps.setString(4, khoa.getCreated_at());
                ps.setString(5, khoa.getUpdated_at());
                int row = ps.executeUpdate();
                if (row < 1) {
                    khoa = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                khoa = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return khoa;
    }

    @Override
    public Khoa updateByID(String maKH , Khoa khoa) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("update khoa set maKH =?, tenKH = ? , lienheKH= ? , updated_at = ? where maKH = ?");
               
                ps.setString(1, khoa.getMakhoa());
                ps.setString(2, khoa.getTenkhoa());
                ps.setString(3, khoa.getSdt());
                ps.setString(4, utils.DateTime.getTimeNow("yyyy-MM-dd hh:mm:ss"));
                ps.setString(5, maKH);
                
                int row = ps.executeUpdate();
                if (row < 1) {
                    khoa = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
                khoa = null;
            }finally{
                DBConnect.close(null,null);
            }
        }
        return khoa;
    }
    
    @Override
    public void deleteKhoa(String KhoaID) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("delete from khoa where maKH = ?");
                ps.setString(1, KhoaID);
                ps.executeUpdate();
                DBConnect.close(null,null);
            } catch (SQLException ex) {
                Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public ArrayList<Khoa> getByID(String makhoa) {
        ArrayList<Khoa> list = null;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.conn.prepareStatement("select *from khoa where maKH = ?");
                psCheck.setString(1, makhoa);
                rs = psCheck.executeQuery();
                list = new ArrayList<Khoa>();
                while (rs.next()) {
                    Khoa o = new Khoa();
                    o.setMakhoa(rs.getString(1));
                    o.setTenkhoa(rs.getString(2));
                    o.setSdt(rs.getString(3));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                DBConnect.close(psCheck, rs);
            }
            
        }
        return list;
    }
    
    @Override
    public boolean checkExists(String makhoa) {
        boolean check = false;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.conn.prepareStatement("select *from khoa where maKH = ?");
                psCheck.setString(1, makhoa);
                rs = psCheck.executeQuery();

                while (rs.next()) {
                    if(rs.getString("maKH").equalsIgnoreCase(makhoa)){
                        return true;
                    }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(KhoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                DBConnect.close(psCheck, rs);
            }
            
        }
        return false;
    }
    
}
