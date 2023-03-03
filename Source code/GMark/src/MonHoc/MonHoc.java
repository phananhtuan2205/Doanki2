/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonHoc;

/**
 *
 * @author TranHung
 */
public class MonHoc {
    private String maMH , tenMH , maHK ;
    private String created_at , updated_at ;

    public MonHoc() {
    }

    public MonHoc(String maMH, String tenMH, String maHK, String created_at, String updated_at) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.maHK = maHK;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public String getMaHK() {
        return maHK;
    }

    public void setMaHK(String maHK) {
        this.maHK = maHK;
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
        return "MonHoc{" + "maMH=" + maMH + ", tenMH=" + tenMH + '}';
    }
    
    
}
