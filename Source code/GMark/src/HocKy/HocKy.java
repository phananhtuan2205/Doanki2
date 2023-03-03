/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HocKy;

/**
 *
 * @author TranHung
 */
public class HocKy {
    private String maHK , tenHK;

    public HocKy() {
    }

    public HocKy(String maHK, String tenHK) {
        this.maHK = maHK;
        this.tenHK = tenHK;
    }

    public String getMaHK() {
        return maHK;
    }

    public void setMaHK(String maHK) {
        this.maHK = maHK;
    }

    public String getTenHK() {
        return tenHK;
    }

    public void setTenHK(String tenHK) {
        this.tenHK = tenHK;
    }

    @Override
    public String toString() {
        return maHK +" - "+ tenHK;
    }
    
}
