package oo.hinhChuNhat;

import java.util.Scanner;

public class HinhChuNhat {
    Scanner scanner = new Scanner(System.in);
    //attribute
    //emplementtation
    private int chieuDai;
    private int chieuRong;

    //method
    //interfaces

    public void setchieuDai(int chieuDai){
        this.chieuDai = chieuDai;
    }
    public int getchieuDai(){
        return this.chieuDai;
    }

    public void setchieuRong(int chieuRong){
        this.chieuRong =chieuRong;
    }
    public int getchieuRong(){
        return this.chieuRong;
    }

    void nhap(){
        System.out.print("Nhap chieu dai: ");
        chieuDai = scanner.nextInt();
        System.out.print("Nhap chieu rong: ");
        chieuRong = scanner.nextInt();
    }
    void tinhChuVi(){
        double chuVi;
        chuVi = (this.chieuDai + this.chieuRong)*2;
        System.out.println("Chu vi hinh chu nhat: "+chuVi);
    }
    void tinhDienTich(){
        double dienTich;
        dienTich = this.chieuDai * this.chieuRong;
        System.out.println("Dien tich hinh chu nhat: "+dienTich);
    }
    


}
