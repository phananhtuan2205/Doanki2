/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopHoc;

/**
 *
 * @author TranHung
 */
public class Lop {
    private String maLop , tenLop , maKH;
    private String  created_at , updated_at ;

    public Lop() {
    }

    public Lop(String maLop, String tenLop, String maKH, String created_at, String updated_at) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maKH = maKH;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Lop(String maLop, String tenLop, String maKH) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maKH = maKH;
    }

    
    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
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
        return "Lop{" + "maLop=" + maLop + ", tenLop=" + tenLop + ", maKH=" + maKH + '}';
    }
    
    
}
