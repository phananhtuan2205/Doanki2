/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SV_Lop;

/**
 *
 * @author TranHung
 */
public class SV_Lop {
    private int id;
    private String maSV , maLop;

    public SV_Lop() {
    }

    public SV_Lop(int id, String maSV, String maLop) {
        this.id = id;
        this.maSV = maSV;
        this.maLop = maLop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    @Override
    public String toString() {
        return "SV_Lop{" + "id=" + id + ", maSV=" + maSV + ", maLop=" + maLop + '}';
    }
    
    
}
