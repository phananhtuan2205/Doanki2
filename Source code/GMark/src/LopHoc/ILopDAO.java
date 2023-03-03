/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopHoc;

import java.util.ArrayList;

/**
 *
 * @author TranHung
 */
public interface ILopDAO {
    //tim theo id hoac  ten (where ... like ) , search all khi s=""
    public ArrayList<Lop> search(String s);
    
    //tim theo id (where ...  = )
    public ArrayList<Lop> getByID(String maLop);
    
    //insert vào db
    public Lop addNew(Lop lop);
    
    //update vào db theo ma
    public Lop updateByID(String  maLop , Lop lop);
    
    //xoa theo id
    public void deleteLop(String maLop) ;
    
    //check da ton tai hay chua
    public boolean checkExists(String maLop) ;
    
    //tim lop theo maSV
    public ArrayList<Lop> getByStudent(String maSV);
}
