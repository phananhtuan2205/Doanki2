/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SV_Lop;

/**
 *
 * @author TranHung
 */
public interface ISV_LopDAO {
    //thêm lớp - sv
    public  void Add(String maSV , String maLop);
    
    
    //xóa sv-lớp
    public void Delete(String maSV , String maLop);
    
    //check xem đã có mã SV này hay chưa 
    public  boolean checkSV(String maSV);
    
    //check xem đã có mã lop này hay chưa 
    public  boolean checkLop(String maLop);
    
    //xóa theo mã SV
    public void DeleteByMaSV(String maSV );
    
    //xóa theo mã lop
    public void DeleteByMaLop(String maLop );
}
