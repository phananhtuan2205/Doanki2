/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package GiangVien;

import java.util.ArrayList;

/**
 *
 * @author TranHung
 */
public interface IGVDAO {
    //tim theo id hoac  ten (where ... like ) , search all khi s=""
    public ArrayList<GiangVien> search(String s);
    
    //tim theo id (where ...  = )
    public ArrayList<GiangVien> getByID(int magv);
    
    //insert vào db
    public GiangVien addNew(GiangVien gv);
    
    //update vào db theo ma
    public GiangVien updateByID(int maGV , GiangVien gv);
    
    //xoa theo id
    public void deleteGiangVien(int maGV) ;
    
    //check da ton tai hay chua
    public boolean checkExists(String maGV) ;
}
