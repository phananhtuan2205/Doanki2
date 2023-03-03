/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiangVien;


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
public class GVDAO implements IGVDAO {

    @Override
    public ArrayList<GiangVien> search(String s) {
        ArrayList<GiangVien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select * from giangvien where maGV like ? or tenGV like ? ");
                
                ps.setString(1, "%"+s+"%");
                ps.setString(2, "%"+s+"%");
                        
                rs = ps.executeQuery();
                list = new ArrayList<GiangVien>();
                while (rs.next()) {
                    GiangVien o = new GiangVien();
                    o.setId(rs.getInt("maGV"));
                    o.setTenGV(rs.getString("tenGV"));
                    o.setGioitinh(rs.getString("gioitinh"));
                    o.setDiachi(rs.getString("diachi"));
                    o.setSdt(rs.getString("sdt"));
                    o.setEmail(rs.getString("email"));
                    o.setNgaysinh(rs.getString("ngaysinh"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GVDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public ArrayList<GiangVien> getByID(int magv) {
        ArrayList<GiangVien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select *from giangvien where maGV = ? ");
                
                ps.setInt(1, magv);
                        
                rs = ps.executeQuery();
                list = new ArrayList<GiangVien>();
                while (rs.next()) {
                    GiangVien o = new GiangVien();
                    o.setId(rs.getInt("maGV"));
                    o.setTenGV(rs.getString("tenGV"));
                    o.setGioitinh(rs.getString("gioitinh"));
                    o.setDiachi(rs.getString("diachi"));
                    o.setSdt(rs.getString("sdt"));
                    o.setEmail(rs.getString("email"));
                    o.setNgaysinh(rs.getString("ngaysinh"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(GVDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public GiangVien addNew(GiangVien gv) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("INSERT INTO giangvien(tenGV , diachi ,sdt,email ,"
                        + " ngaysinh , gioitinh , created_at , updated_at) "
                        + "values (?,?,?,?,?,?,?,?)");
                ps.setString(1, gv.getTenGV());
                ps.setString(2, gv.getDiachi());
                ps.setString(3, gv.getSdt());
                ps.setString(4, gv.getEmail());
                ps.setString(5, gv.getNgaysinh());
                ps.setString(6, gv.getGioitinh());
                ps.setString(7, gv.getCreated_at());
                ps.setString(8, gv.getUpdated_at());
                int row = ps.executeUpdate();
                if (row < 1) {
                    gv = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(GVDAO.class.getName()).log(Level.SEVERE, null, ex);
                gv = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return gv;
    }

    @Override
    public GiangVien updateByID(int maGV, GiangVien gv) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("UPDATE giangvien set tenGV =?, diachi=? ,sdt=?,email =?,"
                        + " ngaysinh =?, gioitinh =?, updated_at=? where maGV = ? ");
                
                ps.setString(1, gv.getTenGV());
                ps.setString(2, gv.getDiachi());
                ps.setString(3, gv.getSdt());
                ps.setString(4, gv.getEmail());
                ps.setString(5, gv.getNgaysinh());
                ps.setString(6, gv.getGioitinh());
                ps.setString(7, utils.DateTime.getTimeNow("yyyy-MM-dd hh:mm:ss"));
                ps.setInt(8, maGV);
                int row = ps.executeUpdate();
                if (row < 1) {
                    gv = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(GVDAO.class.getName()).log(Level.SEVERE, null, ex);
                gv = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return gv;
    }

    @Override
    public void deleteGiangVien(int maGV) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("delete from giangvien where maGV = ?");
                ps.setInt(1, maGV);
                ps.executeUpdate();
                DBConnect.close(null,null);
            } catch (SQLException ex) {
                Logger.getLogger(GVDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public boolean checkExists(String maGV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
