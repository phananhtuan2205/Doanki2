/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaiKhoan;

/**
 *
 * @author TranHung
 */
public class User {

    private int id, role_id;
    private String user_name, fullname, password;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    private String email, phone;
    private String created_at, updated_at;

    public User() {
    }

    public User(int id, int role_id, String user_name, String password, String fullname, String email, String phone, String created_at, String updated_dat) {
        this.id = id;
        this.role_id = role_id;
        this.user_name = user_name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.created_at = created_at;
        this.updated_at = updated_dat;
        this.fullname = fullname;
    }

    public User(int role_id, String user_name, String password, String fullname, String email, String phone) {
        this.role_id = role_id;
        this.user_name = user_name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

}
