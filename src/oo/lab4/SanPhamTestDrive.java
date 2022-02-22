package oo.lab4;

public class SanPhamTestDrive {
    public static void main(String[] args) {
        
        SanPham sanPham = new SanPham();
        sanPham.nhap();
        sanPham.getThueNhapKhau();
        sanPham.xuat();

        SanPham sanPham2 = new SanPham();
        sanPham2.nhap();
        sanPham2.getThueNhapKhau();
        sanPham2.xuat();
        

        SanPham sanPham1;
        sanPham1 = new SanPham("Dien thoai", 2000000);
        sanPham1.xuat();
        SanPham sanPham3;
        sanPham3 = new SanPham("laptop", 8000000,800000);
        sanPham3.xuat();


        
        SanPhamLinkList testSanPhamLinkList = new SanPhamLinkList();
        testSanPhamLinkList.add("Chuot may minh", 100000, 10000);
        testSanPhamLinkList.add("Ban phim", 200000, 20000);
        testSanPhamLinkList.add("Loa", 150000, 15000);
        testSanPhamLinkList.print();

    }
}
