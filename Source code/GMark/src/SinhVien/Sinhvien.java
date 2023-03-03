/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SinhVien;

/**
 *
 * @author pt987
 */
public class Sinhvien {
    String maSV,tenSV,diachi,email,created_at,updated_at,gioitinh;
    String sdt;
    String ngaysinh;
    String hedaotao;
    

    public Sinhvien() {
    }

    public Sinhvien(String maSV, String tenSV) {
        this.maSV = maSV;
        this.tenSV = tenSV;
    }
    
    
    public Sinhvien(String maSV, String tenSV, String diachi, String email, String gioitinh, String sdt, String ngaysinh, String hedaotao) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diachi = diachi;
        this.email = email;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
        this.hedaotao = hedaotao;
    }

    public Sinhvien(String maSV, String tenSV, String diachi, String email, String gioitinh, String sdt, String ngaysinh, String hedaotao , String created_at, String updated_at) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diachi = diachi;
        this.email = email;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.gioitinh = gioitinh;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
        this.hedaotao = hedaotao;
    }
    
    

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getHedaotao() {
        return hedaotao;
    }

    public void setHedaotao(String hedaotao) {
        this.hedaotao = hedaotao;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "maSV=" + maSV + ", tenSV=" + tenSV + '}';
    }

}
