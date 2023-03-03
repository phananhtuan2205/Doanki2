/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Diem;

import java.util.ArrayList;

/**
 *
 * @author TranHung
 */
public interface IDiemDAO {
    //tim theo id hoac  ten (where ... like ) , search all khi s=""
    public ArrayList<Diem> search(String s);
    
    //tìm theo mã SV
    public ArrayList<Diem> getByMaSV(String maSV, String maMH);
    
    //tìm theo mã SV- mã MH
    public ArrayList<Diem> getBySV_MH(String maSV , String maMH);
    
    //tìm theo mã lớp và đã có điểm của môn học 
    public ArrayList<Diem> getByLop_MonHoc(String maLop , String maMH);
    
    //tim theo id (where ...  = )
    public ArrayList<Diem> getByID(int maDiem);
    
    //insert vào db
    public Diem addNew(Diem diem);
    
    //update vào db theo ma
    public Diem updateByID(int maDiem , Diem diem);
    
    //xoa theo id
    public void deleteDiem(int maDiem) ;
    
    //check da ton tai hay chua
    public boolean checkExists(String maSV , String maMH) ;
    
    //thay đổi mã sv của một sinh viên
    public void deleteByMaSV(String maSV);
    
    //check sv da co diem nao hay chua
    public boolean checkExistMaSV(String maSV);
    
    //check mon hoc da co diem nao hay chua
    public boolean checkExistMonHoc(String maMH);
    
    public ArrayList<Diem> getByMaGV(int maGV , String maMH);
    
    
}
