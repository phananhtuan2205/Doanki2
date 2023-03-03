/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaiKhoan;

import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.DBConnect;

/**
 *
 * @author TranHung
 */
public class UserDAO implements IUserDAO {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        User user = new UserDAO().getLoginUser("hung", utils.Security.getMD5("123456"));
        if(user!= null){
            System.out.println(user.getFullname());
        }else {
            System.out.println("Khong ton tai");
        }
    }

    @Override
    public ArrayList<User> getAll() {
        ArrayList<User> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("select *from users");
                rs = ps.executeQuery();
                list = new ArrayList<User>();
                while (rs.next()) {
                    User o = new User();
                    o.setId(rs.getInt("id"));
                    o.setUser_name(rs.getString("user_name"));
                    o.setPassword(rs.getString("password"));
                    o.setFullname(rs.getString("full_name"));
                    o.setEmail(rs.getString("email"));
                    o.setPhone(rs.getString("phone"));
                    o.setCreated_at(rs.getString("created_at"));
                    o.setUpdated_at(rs.getString("updated_at"));
                    o.setRole_id(rs.getInt("role_id"));
                    list.add(o);
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }

        }
        return list;
    }

    @Override
    public User addNew(User user) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("INSERT INTO users(role_id , user_name , password,email , phone , created_at , updated_at , full_name)"
                        + " values (?,?,?,?,?,?,?,?)");
                ps.setInt(1, user.getRole_id());
                ps.setString(2, user.getUser_name());
                ps.setString(3, utils.Security.getMD5(user.getPassword()));
                ps.setString(4, user.getEmail());
                ps.setString(5, user.getPhone());
                ps.setString(6, utils.DateTime.getTimeNow("yyyy-MM-dd HH:mm:ss"));
                ps.setString(7, utils.DateTime.getTimeNow("yyyy-MM-dd HH:mm:ss"));
                ps.setString(8, user.getFullname());
                int row = ps.executeUpdate();
                if (row < 1) {
                    user = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                user = null;
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, null);
            }
        }
        return user;
    }

    @Override
    public User updateByID(String id, User user) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("update users set user_name =?, "
                        + "email = ? ,phone =? , role_id = ? , updated_at = ? , full_name= ? "
                        + "where id = ?");

                ps.setString(1, user.getUser_name());
                ps.setString(2, user.getEmail());
                ps.setString(3, user.getPhone());
                ps.setInt(4, user.getRole_id());
                ps.setString(5, utils.DateTime.getTimeNow("yyyy-MM-dd HH:mm:ss"));
                ps.setString(6, user.getFullname());
                ps.setString(7, id);
                int row = ps.executeUpdate();
                if (row < 1) {
                    user = null;
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                user = null;
            } finally {
                DBConnect.close(null, null);
            }
        }
        return user;
    }

    @Override
    public boolean checkExists(String userName) {
        boolean check = false;
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.conn.prepareStatement("select *from users where user_name = ?");
                psCheck.setString(1, userName);
                rs = psCheck.executeQuery();

                while (rs.next()) {
                    if (rs.getString("user_name").equalsIgnoreCase(userName)) {
                        return true;
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(psCheck, rs);
            }

        }
        return false;
    }

    @Override
    public void delete(int id) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.conn.prepareStatement("delete from users where id = ?");
                ps.setInt(1, id);
                ps.executeUpdate();
                DBConnect.close(null, null);
            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public User getLoginUser(String name, String pass) {
        PreparedStatement psCheck = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.conn.prepareStatement("select *from users where user_name = ? and password = ? ");
                psCheck.setString(1, name);
                psCheck.setString(2, pass);
                rs = psCheck.executeQuery();

                while (rs.next()) {
                    User userLogin = new User();
                    userLogin.setUser_name(name);
                    userLogin.setFullname(rs.getString("full_name"));

                    return userLogin;
                }

            } catch (SQLException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(psCheck, rs);
            }

        }
        return null;

    }
}
