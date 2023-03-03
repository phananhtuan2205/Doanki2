/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SinhVien;

import java.util.ArrayList;

/**
 *
 * @author pt987
 */
public interface ISinhvienDAO {
    //tim theo ten hoac ma sv
    public ArrayList<Sinhvien> search(String s);
    
    //tim theo ten hoac ma sv chưa được add lớp nào
    public ArrayList<Sinhvien> searchOnlyChuaCoLop(String s);
    
     //tim theo mã lớp và chưa học môn này 
    public ArrayList<Sinhvien> searchTheoLop_ChuaCoMonHoc(String maLop , String maMH ,String s);
    
    //tim theo mã lớp và đã học môn này 
    public ArrayList<Sinhvien> searchTheoLop_CoMonHoc(String maLop , String maMH);
    
    //lay data theo masv
    public ArrayList<Sinhvien> getByID(String masv);
    
    //insert
    public Sinhvien addNew(Sinhvien sv);
    
    //update
    public Sinhvien updateByID(String masv , Sinhvien sv);
    
    //delate
    public void deleteSV(String maSV);
    
    //check ton tai maSV
    public boolean checkExists(String maSV);
    
    //lay data theo maLop
    public ArrayList<Sinhvien> getByLop(String maLop);
    
    //check quan he SV-Lop
    public boolean checkConstraint(String maSV , String maLop);
    
    
}
