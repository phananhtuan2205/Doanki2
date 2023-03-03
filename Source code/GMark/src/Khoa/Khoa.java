/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Khoa;

/**
 *
 * @author Anonymous
 */
public class Khoa {
    private String makhoa;
    private String tenkhoa;
    private String sdt;
    private String created_at;
    private String updated_at;

    public Khoa() {
    }

    public Khoa(String makhoa, String tenkhoa, String sdt) {
        this.makhoa = makhoa;
        this.tenkhoa = tenkhoa;
        this.sdt = sdt;
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

    public Khoa(String makhoa, String tenkhoa, String sdt, String created_at, String updated_at) {
        this.makhoa = makhoa;
        this.tenkhoa = tenkhoa;
        this.sdt = sdt;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getMakhoa() {
        return makhoa;
    }

    public void setMakhoa(String makhoa) {
        this.makhoa = makhoa;
    }

    public String getTenkhoa() {
        return tenkhoa;
    }

    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Khoa{" + "makhoa=" + makhoa + ", tenkhoa=" + tenkhoa + ", sdt=" + sdt + '}';
    }
    
    public void display(){
        System.out.println(this);
    }
    
}
