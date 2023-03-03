/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GiangVien;

import java.util.Date;
import utils.DateTime;

/**
 *
 * @author TranHung
 */
public class GiangVien {
    private int id ;
    private String tenGV ;
    private String diachi ;
    private String sdt ;
    private String email ;
    private String gioitinh;
    private String ngaysinh ;
    private String  created_at , updated_at ;

    public GiangVien() {
    }

    public GiangVien(int id, String tenGV, String diachi, String sdt, String email, String gioitinh, String ngaysinh, String created_at, String updated_at) {
        this.id = id;
        this.tenGV = tenGV;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    //without id
    public GiangVien(String tenGV, String diachi, String sdt, String email, String gioitinh, String ngaysinh, String created_at, String updated_at) {
        this.tenGV = tenGV;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
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

    @Override
    public String toString() {
        return "GiangVien{"+"tenGV=" + tenGV + ", sdt=" + sdt + '}';
    }
    
    
    
}
