package oo.lab4;

import java.util.Scanner;

public class SanPham {
    // implementtation
    private String tenSP;
    private double donGia;
    private double giamGia;

    Scanner scanner = new Scanner(System.in);

    // interfaces
    public SanPham(){

    }

    public SanPham(String tenSP, double donGia,double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public SanPham(String tenSP, double donGia){
        this(tenSP, donGia, 0);
    }

    public void setTenSP(){
        this.tenSP = tenSP;
    }

    public String getTenSP(){
        return this.tenSP;
    }

    public void setDonGia(){
        this.donGia = donGia;
    }

    public double getDonGia(){
        return this.donGia;
    }

    void nhap(){
        System.out.print("Nhap ten san pham:");
        tenSP = scanner.nextLine();
        System.out.print("Nhap gia san pham: ");
        donGia = scanner.nextDouble();
    }
    public void getThueNhapKhau(){
        
        this.giamGia  = donGia / 10;;
    }
    public double setThueNhapKhau(){
        return this.giamGia;
    }
    void xuat(){
        System.out.println("Ten san pham: "+tenSP);
        System.out.println("Gia san pham: "+donGia);
        System.out.println("Thue nhap khau: "+giamGia);
    }

    
}
