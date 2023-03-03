/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Role;

import java.util.ArrayList;

/**
 *
 * @author TranHung
 */
public interface IRoleDAO {
     public ArrayList<Role> getAll();
     
     public ArrayList<Role> getRole(int role_id);
}
