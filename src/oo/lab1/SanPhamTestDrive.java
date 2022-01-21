package oo.lab1;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        /*
        SanPham sanPham = new SanPham();
        sanPham.nhap();
        sanPham.getThueNhapKhau();
        sanPham.xuat();

        SanPham sanPham2 = new SanPham();
        sanPham2.nhap();
        sanPham2.getThueNhapKhau();
        sanPham2.xuat();
        */

        //cau 3
        SanPham sanPham1;
        sanPham1 = new SanPham("Dien thoai", 5000000);
        sanPham1.xuat();
        SanPham sanPham3;
        sanPham3 = new SanPham("laptop", 10000000, 10);
        sanPham3.xuat();


    }
}
