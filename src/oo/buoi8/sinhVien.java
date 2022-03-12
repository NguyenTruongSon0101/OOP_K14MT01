package oo.buoi8;

public class sinhVien {
    //
    private int maSV;
    private String hoTen;
    private String diaChi;
    private double sdt;

    //
    public sinhVien(){
        this.maSV = 0;
        this.hoTen = null;
        this.diaChi = null;
        this.sdt = 0;
    }
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
    public int getMaSV() {
        return maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getDiaChi() {
        return diaChi;
    }

    public void setSdt(double sdt) {
        this.sdt = sdt;
    }
    public double getSdt() {
        return sdt;
    }

    

}
