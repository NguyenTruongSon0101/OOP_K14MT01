package oo;

import java.util.Scanner;

public class Student {
    // attribute
    String tenSV ;
    String maSV ;
    String lop ;
    String khoa ;
    String nganh ;

    //contructor
    public Student(){
        
    }

    public Student(String tenSV, String maSV){
        this.tenSV = tenSV;
        this.maSV = maSV;
    }

    public Student(String tenSV, String maSV, String lop, String khoa, String nganh ){
    this(tenSV, maSV);
    this.lop = lop;
    this.khoa = khoa;
    this.nganh = nganh;
    }
    //method
    void nhapThongTin(){
        System.out.println("Nhap ten Sinh vien: ");
        Scanner scanner = new Scanner(System.in);
        tenSV = scanner.nextLine();
        System.out.println("nhap ma sv: ");
        maSV = scanner.nextLine();
        System.out.println("Nhap lop: ");
        lop = scanner.nextLine();
        System.out.println("Nhap khoa: ");
        khoa = scanner.nextLine();
        System.out.println("Nhap nganh: ");
        nganh = scanner.nextLine();
    }

    void inThongTin(){
        System.out.println("Thong tin sinh vien");
        System.out.println("Ten sinh vien: "+tenSV);
        System.out.println("Ma sinh vien: "+maSV );
        System.out.println("lop: "+lop);
        System.out.println("Khoa: "+khoa);
        System.out.println("Nganh: "+nganh);
    }
    void hoc(){
        String monHoc1 = "Huong doi tuong";
        String monHoc2 = "He dieu hanh";
        String monHoc3 = "Mac-lenin";
        System.out.print("danh sach mon hoc: "+monHoc1+": "+monHoc2+": "+monHoc3);
    }
    void thongTinHoatDong(){
        System.out.println("Hoat dong ...");
    }
    void thi(){
        System.out.println("Diem: ...");
    }
    void phatBieu(){
        System.out.println("So lan phat bieu: ...");
    }
}
