/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diem;

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
public class DiemDAO implements IDiemDAO{

    @Override
    public ArrayList<Diem> search(String s) {
        
        ArrayList<Diem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select * from diem where maDiem like ? order by updated_at desc ");
                
                ps.setString(1, "%"+s+"%");
                        
                rs = ps.executeQuery();
                list = new ArrayList<Diem>();
                while (rs.next()) {
                    Diem o = new Diem();
                    o.setMaDiem(rs.getInt("maDiem"));
                    o.setDiem(rs.getFloat("diem"));
                    o.setMaSV(rs.getString("maSV"));
                    o.setMamh(rs.getString("maMH"));
                    o.setMaGV(rs.getInt("maGV"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public ArrayList<Diem> getByID(int maDiem) {
        ArrayList<Diem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select * from diem where maDiem = ? ");
                
                ps.setInt(1, maDiem);
                        
                rs = ps.executeQuery();
                list = new ArrayList<Diem>();
                while (rs.next()) {
                    Diem o = new Diem();
                    o.setMaDiem(rs.getInt("maDiem"));
                    o.setDiem(rs.getFloat("diem"));
                    o.setMaSV(rs.getString("maSV"));
                    o.setMamh(rs.getString("maMH"));
                    o.setMaGV(rs.getInt("maGV"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public Diem addNew(Diem diem) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("INSERT INTO diem(maSV , diem ,maMH , maGV ,"
                        + "created_at , updated_at) "
                        + "values (?,?,?,?,?,?)");
                ps.setString(1, diem.getMaSV());
                ps.setFloat(2, diem.getDiem());
                ps.setString(3, diem.getMamh());
                ps.setInt(4, diem.getMaGV());
                ps.setString(5, diem.getCreated_at());
                ps.setString(6, diem.getUpdated_at());
                int row = ps.executeUpdate();
                if (row < 1) {
                    diem = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
                diem = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return diem;
    }

    @Override
    public Diem updateByID(int maDiem, Diem diem) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("UPDATE  diem set maSV =? , diem  =? ,maMH  =? , maGV  =? , updated_at = ? where maDiem  =? ");
                ps.setString(1, diem.getMaSV());
                ps.setFloat(2, diem.getDiem());
                ps.setString(3, diem.getMamh());
                ps.setInt(4, diem.getMaGV());
                ps.setString(5, diem.getUpdated_at());
                ps.setInt(6, maDiem);
                int row = ps.executeUpdate();
                if (row < 1) {
                    diem = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
                diem = null;
            }finally{
                DBConnect.close(ps,null);
            }
        }
        return diem;
    }

    @Override
    public void deleteDiem(int maDiem) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("delete from diem where maDiem = ? ");
                
                ps.setInt(1, maDiem);
                
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                DBConnect.close(ps,null);
            }
        }
    }

    @Override
    public boolean checkExists(String maSV , String maMH) {
        if(getBySV_MH(maSV, maMH).size()> 0 ){
            return true;
        }
        return false;
    }
    
    

    @Override
    public ArrayList<Diem> getByMaSV(String maSV , String maMH) {
        ArrayList<Diem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                if (maMH==null) {
                    ps = DBConnect.conn.prepareStatement("select * from diem where maSV = ?  order by updated_at desc  ");
                    ps.setString(1, maSV);
                }else{
                    ps = DBConnect.conn.prepareStatement("select * from diem where maSV = ? and maMH =? order by updated_at desc  ");
                    ps.setString(1, maSV);
                    ps.setString(2, maMH);
                }
                        
                rs = ps.executeQuery();
                list = new ArrayList<Diem>();
                while (rs.next()) {
                    Diem o = new Diem();
                    o.setMaDiem(rs.getInt("maDiem"));
                    o.setDiem(rs.getFloat("diem"));
                    o.setMaSV(rs.getString("maSV"));
                    o.setMamh(rs.getString("maMH"));
                    o.setMaGV(rs.getInt("maGV"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public ArrayList<Diem> getBySV_MH(String maSV, String maMH) {
        ArrayList<Diem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select * from diem where maSV = ? and maMH= ?  ");
                
                ps.setString(1, maSV);
                ps.setString(2, maMH);
                
                rs = ps.executeQuery();
                list = new ArrayList<Diem>();
                while (rs.next()) {
                    Diem o = new Diem();
                    o.setMaDiem(rs.getInt("maDiem"));
                    o.setDiem(rs.getFloat("diem"));
                    o.setMaSV(rs.getString("maSV"));
                    o.setMamh(rs.getString("maMH"));
                    o.setMaGV(rs.getInt("maGV"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }
    
    @Override
    public ArrayList<Diem> getByMaGV(int maGV, String maMH) {
        ArrayList<Diem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                if (maMH == null) {
                    ps = DBConnect.conn.prepareStatement("select * from diem where maGV = ? ");
                    ps.setInt(1, maGV);
                }else{
                    ps = DBConnect.conn.prepareStatement("select * from diem where maGV = ? and maMH = ? ");
                    ps.setInt(1, maGV);
                    ps.setString(2, maMH);
                }
                
                rs = ps.executeQuery();
                list = new ArrayList<Diem>();
                while (rs.next()) {
                    Diem o = new Diem();
                    o.setMaDiem(rs.getInt("maDiem"));
                    o.setDiem(rs.getFloat("diem"));
                    o.setMaSV(rs.getString("maSV"));
                    o.setMamh(rs.getString("maMH"));
                    o.setMaGV(rs.getInt("maGV"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public ArrayList<Diem> getByLop_MonHoc(String maLop, String maMH) {
        
        ArrayList<Diem> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("SELECT diem.* from diem , sinhvien ,sv_lop , monhoc "
                        + " where diem.maMH = monhoc.maMH and diem.maSV = sinhvien.maSV and sv_lop.maSV = sinhvien.maSV "
                        + " and sv_lop.maLop = ? and monhoc.maMH = ? order by updated_at desc");
                
                ps.setString(1, maLop);
                ps.setString(2, maMH);
                
                rs = ps.executeQuery();
                list = new ArrayList<Diem>();
                while (rs.next()) {
                    Diem o = new Diem();
                    o.setMaDiem(rs.getInt("maDiem"));
                    o.setDiem(rs.getFloat("diem"));
                    o.setMaSV(rs.getString("maSV"));
                    o.setMamh(rs.getString("maMH"));
                    o.setMaGV(rs.getInt("maGV"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public void deleteByMaSV(String maSV) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("DELETE from  diem where maSV =? ");
                ps.setString(1, maSV);
                
                ps.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                DBConnect.close(ps,null);
            }
        }
    }

    @Override
    public boolean checkExistMaSV(String maSV) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select * from diem where maSV = ? ");
                
                ps.setString(1, maSV);
                        
                rs = ps.executeQuery();
                if (rs.next()) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return false;
    }

    @Override
    public boolean checkExistMonHoc(String maMH) {
         PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select * from diem where maMH = ? ");
                
                ps.setString(1, maMH);
                        
                rs = ps.executeQuery();
                if (rs.next()) {
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DiemDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return false;
    }
}
