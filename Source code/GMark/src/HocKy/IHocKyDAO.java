/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package HocKy;

import java.util.ArrayList;

/**
 *
 * @author TranHung
 */
public interface IHocKyDAO {
    
    public ArrayList<HocKy> getAll();
    
    //tìm theo maHK
    public HocKy getByID(String maHK);
    
}
