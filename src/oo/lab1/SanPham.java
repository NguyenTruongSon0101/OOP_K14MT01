package oo.lab1;

import java.util.Scanner;

public class SanPham {
    
    String tenSP;
    double donGia;
    double giamGia;

    Scanner scanner = new Scanner(System.in);

    public SanPham(String tenSP, double donGia,double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public SanPham(String tenSP, double donGia){
        this(tenSP, donGia, 0);
    }

    void nhap(){
        System.out.print("Nhap ten san pham:");
        tenSP = scanner.nextLine();
        System.out.print("Nhap gia san pham: ");
        donGia = scanner.nextDouble();
    }
    private void getThueNhapKhau(){
        giamGia = donGia / 10;
    }
    public void xuat(){
        System.out.println("");
        System.out.println("");
        System.out.println("Ten san pham: "+tenSP);
        System.out.println("Gia san pham: "+donGia);
        System.out.println("Thue nhap khau: "+giamGia);
    }
}
