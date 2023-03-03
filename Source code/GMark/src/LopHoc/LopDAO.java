/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopHoc;

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
public class LopDAO implements ILopDAO{

    @Override
    public ArrayList<Lop> search(String s) {
        ArrayList<Lop> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select * from lop where maLop like ? ");
                
                ps.setString(1, "%"+s+"%");
                        
                rs = ps.executeQuery();
                list = new ArrayList<Lop>();
                while (rs.next()) {
                    Lop o = new Lop();
                    o.setMaLop(rs.getString("maLop"));
                    o.setTenLop(rs.getString("tenLop"));
                    o.setMaKH(rs.getString("maKH"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public ArrayList<Lop> getByID(String maLop) {
        ArrayList<Lop> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select *from lop where maLop = ? ");
                
                ps.setString(1,maLop);
                        
                rs = ps.executeQuery();
                list = new ArrayList<Lop>();
                while (rs.next()) {
                    Lop o = new Lop();
                    o.setMaLop(rs.getString("maLop"));
                    o.setTenLop(rs.getString("tenLop"));
                    o.setMaKH(rs.getString("maKH"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public Lop addNew(Lop lop) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("INSERT INTO lop(maLop , tenLop , maKH ,"
                        + "created_at , updated_at) "
                        + "values (?,?,?,?,?)");
                ps.setString(1, lop.getMaLop());
                ps.setString(2, lop.getTenLop());
                ps.setString(3, lop.getMaKH());
                ps.setString(4, lop.getCreated_at());
                ps.setString(5, lop.getUpdated_at());
                int row = ps.executeUpdate();
                if (row < 1) {
                    lop = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopDAO.class.getName()).log(Level.SEVERE, null, ex);
                lop = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return lop;
    }

    @Override
    public Lop updateByID(String maLop, Lop lop) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("UPDATE  lop set maLop =? , tenLop =?  , maKH  =? ,"
                        + "updated_at =?  "
                        + "where maLop = ?");
                ps.setString(1, lop.getMaLop());
                ps.setString(2, lop.getTenLop());
                ps.setString(3, lop.getMaKH());
                ps.setString(4, utils.DateTime.getTimeNow("yyyy-MM-dd hh:mm:ss"));
                ps.setString(5, maLop);
                int row = ps.executeUpdate();
                if (row < 1) {
                    lop = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopDAO.class.getName()).log(Level.SEVERE, null, ex);
                lop = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return lop;
    }

    @Override
    public void deleteLop(String maLop) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("delete from lop where maLop = ?");
                ps.setString(1, maLop);
                ps.executeUpdate();
                DBConnect.close(null,null);
            } catch (SQLException ex) {
                Logger.getLogger(LopDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean checkExists(String maLop) {
        boolean check = false;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.conn.prepareStatement("select *from lop where maLop = ?");
                psCheck.setString(1, maLop);
                rs = psCheck.executeQuery();

                while (rs.next()) {
                    if(rs.getString("maLop").equalsIgnoreCase(maLop)){
                        return true;
                    }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(LopDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                DBConnect.close(psCheck, rs);
            }
            
        }
        return false;
    }
    
    @Override
    public ArrayList<Lop> getByStudent(String maSV) {
        ArrayList<Lop> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select lop.* from sinhvien , sv_lop , lop "
                        + " where sv_lop.maSV = sinhvien.maSV and sv_lop.maLop = lop.maLop "
                        + "and sinhvien.maSV = ? ");
                
                ps.setString(1,maSV);
                        
                rs = ps.executeQuery();
                list = new ArrayList<Lop>();
                while (rs.next()) {
                    Lop o = new Lop();
                    o.setMaLop(rs.getString("maLop"));
                    o.setTenLop(rs.getString("tenLop"));
                    o.setMaKH(rs.getString("maKH"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }
    
}
