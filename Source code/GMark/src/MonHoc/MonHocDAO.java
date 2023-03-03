/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonHoc;


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
public class MonHocDAO implements IMonHocDAO{

    @Override
    public ArrayList<MonHoc> search(String s) {
        ArrayList<MonHoc> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select *from monhoc where maMH like ? ");
                
                ps.setString(1, "%"+s+"%");
                        
                rs = ps.executeQuery();
                list = new ArrayList<MonHoc>();
                while (rs.next()) {
                    MonHoc o = new MonHoc();
                    o.setMaMH( rs.getString("maMH"));
                    o.setTenMH( rs.getString("tenMH"));
                    o.setMaHK(rs.getString("maHK"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public ArrayList<MonHoc> searchID(String maMH) {
        ArrayList<MonHoc> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select * from monhoc where maMH = ? ");
                
                ps.setString(1, maMH);
                        
                rs = ps.executeQuery();
                list = new ArrayList<MonHoc>();
                while (rs.next()) {
                    MonHoc o = new MonHoc();
                    o.setMaMH( rs.getString("maMH"));
                    o.setTenMH( rs.getString("tenMH"));
                    o.setMaHK(rs.getString("maHK"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public MonHoc addNew(MonHoc mh) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("INSERT INTO monhoc(maMH , tenMH , maHK , created_at , updated_at) "
                        + "values (?,?,?,?,?)");
                ps.setString(1, mh.getMaMH());
                ps.setString(2, mh.getTenMH());
                ps.setString(3, mh.getMaHK());
                ps.setString(4, mh.getCreated_at());
                ps.setString(5, mh.getUpdated_at());
                
                int row = ps.executeUpdate();
                if (row < 1) {
                    mh = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
                mh = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return mh;
    }

    @Override
    public MonHoc updateByID(String maMH, MonHoc mh) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("UPDATE  monhoc set maMH = ?, tenMH = ? , maHK = ? ,"
                        + " created_at  = ?, updated_at = ? where maMH = ? ");
                ps.setString(1, mh.getMaMH());
                ps.setString(2, mh.getTenMH());
                ps.setString(3, mh.getMaHK());
                ps.setString(4, mh.getCreated_at());
                ps.setString(5, mh.getUpdated_at());
                ps.setString(6, maMH);
                
                int row = ps.executeUpdate();
                if (row < 1) {
                    mh = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
                mh = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return mh;
    }

    @Override
    public void deleteMonHoc(String maMH) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("delete from monhoc where maMH = ?");
                ps.setString(1, maMH);
                ps.executeUpdate();
                DBConnect.close(null,null);
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean checkExists(String maMH) {
        boolean check = false;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.conn.prepareStatement("select *from monhoc where maMH = ?");
                psCheck.setString(1, maMH);
                rs = psCheck.executeQuery();

                while (rs.next()) {
                    if(rs.getString("maMH").equalsIgnoreCase(maMH)){
                        return true;
                    }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(MonHocDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                DBConnect.close(psCheck, rs);
            }
            
        }
        return false;
    }
    
}
