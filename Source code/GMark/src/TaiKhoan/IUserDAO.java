/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TaiKhoan;

import java.util.ArrayList;

/**
 *
 * @author TranHung
 */
public interface IUserDAO {

    public ArrayList<User> getAll();

    public User addNew(User user);

    public User updateByID(String id, User user);

    public void delete(int id);

    public boolean checkExists(String userName);
}
