package oo.sach;

import java.util.Date;

public class SachGiaoKhoa extends Sach {
    private boolean tinhTrang ; //false = moi
    //

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaXB ,
            Boolean tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXB);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double tinhTien() {
        double tien = 0 ;
        if(!this.tinhTrang){
            tien = getSoLuong()*getDonGia();
        }else
            tien = getSoLuong() * (getDonGia() * 0.5);
        return tien;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"Tinh trang"+ tinhTrang;
    }
    
}
