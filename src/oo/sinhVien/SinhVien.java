package oo.sinhVien;

import java.util.Scanner;

public class SinhVien {
    Scanner scanner = new Scanner(System.in);
    //attribute
    //emplementtation
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    //interfaces
    //constructor
    public  SinhVien(){
        this.maSV = 0;
        this.hoTen = null;
        this.diemLT = 0f;
        this.diemTH = 0f;
    }

    public SinhVien(int maSV, String hoTen, float diemLT, float diemTH ){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    //method 
    
    public void setmaSV(int maSV){
        this.maSV = maSV;
    }
    public int getmaSV(){
        return this.maSV;
    }

    public void sethoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String gethoTen(){
        return this.hoTen;
    }

    public void setdiemLT(float diemLT){
        this.diemLT = diemLT;
    }
    public float getdiemLT(){
        return this.diemLT;
    }

    public void setdiemTH(float diemTH){
        this.diemTH = diemTH;
    }
    public float getdiemTH(){
        return this.diemTH;
    }

    public double tinhDiemTB(){
        double diemTB;
        diemTB = (this.diemLT + this.diemTH)/2;
        return diemTB;
    }
    public void nhap(){
        System.out.print("Nhap ma so sinh vien:");
        this.maSV = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap diem ly thuyet: ");
        this.diemLT = scanner.nextFloat();
        System.out.print("Nhap diem thuc hanh: ");
        this.diemTH = scanner.nextFloat();
    }
    public String toString(){
        String str = "MSSV: "+this.maSV+ ". Ho Ten: "+this.hoTen ;
        str = str + ". Diem Ly Thuyet: " +this.diemLT +". Diem Thuc Hanh: "+ this.diemTH ;
        str = str + ". Diem Trung Binh: "+this.tinhDiemTB();
        return str ;
    }
}
