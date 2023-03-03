/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diem;

/**
 *
 * @author TranHung
 */
public class Diem {
    int maDiem ;
    float diem;
    String maSV;
    int maGV;
    String mamh;
    String created_at , updated_at;

    public Diem() {
    }

    public Diem(int maDiem, float diem, String maSV, int maGV, String mamh, String created_at, String updated_at) {
        this.maDiem = maDiem;
        this.diem = diem;
        this.maSV = maSV;
        this.maGV = maGV;
        this.mamh = mamh;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Diem(float diem, String maSV, String mamh, int maGV, String created_at, String updated_at) {
        this.diem = diem;
        this.maSV = maSV;
        this.maGV = maGV;
        this.mamh = mamh;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    
    public int getMaDiem() {
        return maDiem;
    }

    public void setMaDiem(int maDiem) {
        this.maDiem = maDiem;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public int getMaGV() {
        return maGV;
    }

    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }

    public String getMamh() {
        return mamh;
    }

    public void setMamh(String mamh) {
        this.mamh = mamh;
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
        return "Diem{" + "ma SV=" + maSV + ", Diem =" + diem + ", maGV=" + maGV + ", mamh=" + mamh + '}';
    }
    
    
}
