package oo.sach;

import java.util.Date;

public class Sach {
    private String maSach;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String nhaXB;
    

    //
    public Sach(){

    }

    public Sach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXB) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXB = nhaXB;
        
    }

    
    public int getSoLuong() {
        return soLuong;
    }
    public double getDonGia() {
        return donGia;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ma sach: "+maSach +"Ngay nhap: "+ngayNhap + "Don Gia: "+donGia+ "So luong: "+soLuong+"Nha xuat ban: "+nhaXB;
    }
    protected double tinhTien(){
        return 0;
    }

    
}
