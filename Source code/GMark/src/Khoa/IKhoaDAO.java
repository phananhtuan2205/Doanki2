/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Khoa;

import java.util.ArrayList;

/**
 *
 * @author Anonymous
 */
public interface IKhoaDAO {
    
    //tim theo id hoac  ten (where ... like ) , search all khi s=""
    public ArrayList<Khoa> search(String s);
    
    //tim theo id (where ...  = )
    public ArrayList<Khoa> getByID(String makhoa);
    
    //insert vào db
    public Khoa addNew(Khoa khoa);
    
    //update vào db theo ma
    public Khoa updateByID(String maKH , Khoa khoa);
    
    //xoa theo id
    public void deleteKhoa(String KhoaID) ;
    
    //check da ton tai hay chua
    public boolean checkExists(String makhoa) ;
}
