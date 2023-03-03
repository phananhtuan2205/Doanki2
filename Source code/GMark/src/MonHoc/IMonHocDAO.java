/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package MonHoc;

import java.util.ArrayList;

/**
 *
 * @author TranHung
 */
public interface IMonHocDAO {
    //tim theo id hoac  ten (where ... like ) , search all khi s=""
    public ArrayList<MonHoc> search(String s);
    
    //tim theo ma MH (where ...  = )
    public ArrayList<MonHoc> searchID(String maMH);
    
    //insert vào db
    public MonHoc addNew(MonHoc mh);
    
    //update vào db theo ma
    public MonHoc updateByID(String maMH , MonHoc mh);
    
    //xoa theo id
    public void deleteMonHoc(String maMH) ;
    
    //check da ton tai hay chua
    public boolean checkExists(String maMH) ;
}
