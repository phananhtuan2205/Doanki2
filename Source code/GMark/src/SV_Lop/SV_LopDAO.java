/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SV_Lop;

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
public class SV_LopDAO implements ISV_LopDAO{

    @Override
    public void Add(String maSV , String maLop) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("INSERT INTO sv_lop(maSV, maLop) values (?,?)");
                ps.setString(1, maSV);
                ps.setString(2, maLop);

                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(SV_LopDAO.class.getName()).log(Level.SEVERE, null, ex);
                
            }finally{
                DBConnect.close(ps,null);
            }
        }
    }

    @Override
    public void Delete(String maSV , String maLop) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("DELETE from sv_lop where  maSV = ? and maLop = ? ");
                ps.setString(1, maSV);
                ps.setString(2, maLop);

                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(SV_LopDAO.class.getName()).log(Level.SEVERE, null, ex);
                
            }finally{
                DBConnect.close(ps,null);
            }
        }
    }
    
    @Override
    public void DeleteByMaSV(String maSV ) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("DELETE from sv_lop where  maSV = ? ");
                ps.setString(1, maSV);

                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(SV_LopDAO.class.getName()).log(Level.SEVERE, null, ex);
                
            }finally{
                DBConnect.close(ps,null);
            }
        }
    }

    @Override
    public boolean checkSV(String maSV) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("SELECT * from sv_lop where maSV = ?");
                
                ps.setString(1, maSV);
                
                rs = ps.executeQuery();
                
                if (rs.next()) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SV_LopDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return false;
    }
    
    @Override
    public boolean checkLop(String maLop) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("SELECT * from sv_lop where maLop = ?");
                
                ps.setString(1, maLop);
                
                rs = ps.executeQuery();
                
                if (rs.next()) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SV_LopDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return false;
    }
    

    @Override
    public void DeleteByMaLop(String maLop) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("DELETE from sv_lop where  maLop = ? ");
                ps.setString(1, maLop);

                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(SV_LopDAO.class.getName()).log(Level.SEVERE, null, ex);
                
            }finally{
                DBConnect.close(ps,null);
            }
        }
    }
    
}
