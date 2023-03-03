/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

import Khoa.Khoa;
import LopHoc.LopDAO;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBConnect;
import utils.DateTime;

/**
 *
 * @author pt987
 */
public class SinhvienDAO implements ISinhvienDAO {

    @Override
    public ArrayList<Sinhvien> search(String s) {
        ArrayList<Sinhvien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select * from sinhvien where maSV like ? or tenSV like ? order by updated_at desc ");
                
                ps.setString(1, "%"+s+"%");
                ps.setString(2, "%"+s+"%");
                        
                rs = ps.executeQuery();
                list = new ArrayList<Sinhvien>();
                while (rs.next()) {
                    Sinhvien o = new Sinhvien();
                    o.setMaSV(rs.getString("maSV"));
                    o.setTenSV(rs.getString("tenSV"));
                    o.setGioitinh(rs.getString("gioitinh"));
                    o.setDiachi(rs.getString("diachi"));
                    o.setSdt(rs.getString("sdt"));
                    o.setEmail(rs.getString("email"));
                    o.setNgaysinh(rs.getString("ngaysinh"));
                    o.setHedaotao(rs.getString("hedaotao"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }
    
     @Override
    public ArrayList<Sinhvien> getByID(String masv) {
        ArrayList<Sinhvien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select * from sinhvien where maSV = ? ");
                
                ps.setString(1, masv);
                        
                rs = ps.executeQuery();
                list = new ArrayList<Sinhvien>();
                while (rs.next()) {
                    Sinhvien o = new Sinhvien();
                    o.setMaSV(rs.getString("maSV"));
                    o.setTenSV(rs.getString("tenSV"));
                    o.setGioitinh(rs.getString("gioitinh"));
                    o.setDiachi(rs.getString("diachi"));
                    o.setSdt(rs.getString("sdt"));
                    o.setEmail(rs.getString("email"));
                    o.setNgaysinh(rs.getString("ngaysinh"));
                    o.setHedaotao(rs.getString("hedaotao"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }
    
    @Override
    public Sinhvien addNew(Sinhvien sv) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("INSERT INTO sinhvien(maSV , tenSV , diachi ,sdt,email ,"
                        + "hedaotao, ngaysinh , gioitinh , created_at , updated_at) "
                        + "values (?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, sv.getMaSV());
                ps.setString(2, sv.getTenSV());
                ps.setString(3, sv.getDiachi());
                ps.setString(4, sv.getSdt());
                ps.setString(5, sv.getEmail());
                ps.setString(6, sv.getHedaotao());
                ps.setString(7, sv.getNgaysinh());
                ps.setString(8, sv.getGioitinh());
                ps.setString(9, sv.getCreated_at());
                ps.setString(10, sv.getUpdated_at());
                int row = ps.executeUpdate();
                if (row < 1) {
                    sv = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
                sv = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return sv;
    }

    @Override
    public Sinhvien updateByID(String maSV, Sinhvien sv) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("UPDATE sinhvien set maSV =? , tenSV =?  ,"
                        + " diachi =?  ,sdt =? ,email =?  ,hedaotao =? , ngaysinh  =? , gioitinh  =? ,"
                        + "updated_at  =? where maSV = ? " );
                ps.setString(1, sv.getMaSV());
                ps.setString(2, sv.getTenSV());
                ps.setString(3, sv.getDiachi());
                ps.setString(4, sv.getSdt());
                ps.setString(5, sv.getEmail());
                ps.setString(6, sv.getHedaotao());
                ps.setString(7, sv.getNgaysinh());
                ps.setString(8, sv.getGioitinh());
                ps.setString(9, sv.getUpdated_at());
                
                ps.setString(10, maSV);
                int row = ps.executeUpdate();
                if (row < 1) {
                    sv = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
                sv = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return sv;
    }

    

    @Override
    public boolean checkExists(String maSV) {
        
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.conn.prepareStatement("select *from sinhvien where maSV = ?");
                psCheck.setString(1, maSV);
                rs = psCheck.executeQuery();

                while (rs.next()) {
                    if (rs.getString("maSV").equalsIgnoreCase(maSV)) {
                        return true;
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(psCheck, rs);
            }

        }
        return false;
    }

    @Override
    public void deleteSV(String maSV) {
         PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("delete from sinhvien where maSV = ?");
                ps.setString(1, maSV);
                ps.executeUpdate();
                DBConnect.close(null,null);
            } catch (SQLException ex) {
                Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

   
    @Override
    public ArrayList<Sinhvien> getByLop(String maLop) {
        ArrayList<Sinhvien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select sinhvien.* from sinhvien , sv_lop , lop "
                        + " where sv_lop.maSV = sinhvien.maSV and sv_lop.maLop = lop.maLop "
                        + "and lop.maLop= ? ");
                
                ps.setString(1, maLop);
                        
                rs = ps.executeQuery();
                list = new ArrayList<Sinhvien>();
                while (rs.next()) {
                    Sinhvien o = new Sinhvien();
                    o.setMaSV(rs.getString("maSV"));
                    o.setTenSV(rs.getString("tenSV"));
                    o.setGioitinh(rs.getString("gioitinh"));
                    o.setDiachi(rs.getString("diachi"));
                    o.setSdt(rs.getString("sdt"));
                    o.setEmail(rs.getString("email"));
                    o.setNgaysinh(rs.getString("ngaysinh"));
                    o.setHedaotao(rs.getString("hedaotao"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public boolean checkConstraint(String maSV, String maLop) {
         PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select sinhvien.* from sinhvien , sv_lop , lop "
                        + " where sv_lop.maSV = sinhvien.maSV and sv_lop.maLop = lop.maLop "
                        + " and sinhvien.maSV=? and lop.maLop= ? ");
                
                ps.setString(1, maSV);
                ps.setString(2, maLop);
                rs = ps.executeQuery();

                if (rs.next()) {
                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return false;
    }

    @Override
    public ArrayList<Sinhvien> searchTheoLop_ChuaCoMonHoc(String maLop, String maMH, String s) {
        ArrayList<Sinhvien> listSV = new ArrayList<>();
        
        ArrayList<Sinhvien> listAll = new SinhvienDAO().getByLop(maLop);
        
        ArrayList<Sinhvien> list = searchTheoLop_CoMonHoc(maLop, maMH);
        
        for(int i = 0 ; i< listAll.size() ; i++){
            for(int j = 0 ; j< list.size() ; j++){
                if (listAll.get(i).getMaSV().equals(list.get(j).getMaSV())) {
                    listAll.remove(i);
                    list.remove(j);
                    j--;
                    i--;
                    break;
                }
            }
        }
       //duoc list chua co diem
       
       //di tim khiem:
        for (Sinhvien sinhvien : listAll) {
            if (sinhvien.getMaSV().toLowerCase().contains(s.toLowerCase()) || sinhvien.getTenSV().toLowerCase().contains(s.toLowerCase()) ) {
                listSV.add(sinhvien);
            }
        }
        return listSV;
    }
    
    @Override
    public ArrayList<Sinhvien> searchTheoLop_CoMonHoc(String maLop, String maMH) {
        ArrayList<Sinhvien> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                //lấy ra những sinh viên trong lớp mà chưa có môn học này 
                ps = DBConnect.conn.prepareStatement("SELECT sinhvien.* "
                        + " from sinhvien , sv_lop , diem , monhoc "
                        + " where diem.maSV = sinhvien.maSV and sv_lop.maSV = sinhvien.maSV and monhoc.maMH = diem.maMH "
                        + " and sv_lop.maLop = ? and monhoc.maMH = ? ");
                
                ps.setString(1,maLop); //ma lop
                ps.setString(2,maMH); //ma mon hoc
                
                        
                rs = ps.executeQuery();
                list = new ArrayList<Sinhvien>();
                while (rs.next()) {
                    Sinhvien o = new Sinhvien();
                    o.setMaSV(rs.getString("maSV"));
                    o.setTenSV(rs.getString("tenSV"));
                    o.setGioitinh(rs.getString("gioitinh"));
                    o.setDiachi(rs.getString("diachi"));
                    o.setSdt(rs.getString("sdt"));
                    o.setEmail(rs.getString("email"));
                    o.setNgaysinh(rs.getString("ngaysinh"));
                    o.setHedaotao(rs.getString("hedaotao"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(SinhvienDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public ArrayList<Sinhvien> searchOnlyChuaCoLop(String s) {
        ArrayList<Sinhvien> allSV = search(s);
        ArrayList<Sinhvien> result = new ArrayList<>();
        
        for (Sinhvien sv : allSV) {
            //check xem sv này có lớp chưa
            if ( new LopDAO().getByStudent(sv.getMaSV()).size()==0 ) {
                result.add(sv);
            }
        }
        
        return result;
    }
    
}
