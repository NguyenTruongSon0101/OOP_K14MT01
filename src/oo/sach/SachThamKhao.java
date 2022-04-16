package oo.sach;

import java.util.Date;

public class SachThamKhao extends Sach {
    private float thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXB ,
            float thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXB);
        this.thue = thue;
    }

    @Override
    public double tinhTien() {
        double tien;
        tien = this.getSoLuong() * this.getDonGia() + thue;
        return tien;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Thue"+thue;
    }
    
}
