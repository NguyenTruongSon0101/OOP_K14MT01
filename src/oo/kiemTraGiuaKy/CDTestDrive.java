package oo.kiemTraGiuaKy;

import java.util.Scanner;

public class CDTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int x;
    ListCD dsCD = new ListCD();
    do{
        System.out.println("-------MENU-------");
        System.out.println("\t0.Thoat");
        System.out.println("\t1.Them CD");
        System.out.println("\t2.So luong CD trong danh sach");
        System.out.println("\t3.Tong gia thanh CD");
        System.out.println("\t4.Sap xep CD giam theo gia");
        System.out.println("\t5.Sap xep CD tang theo tua");
        System.out.println("\t6.Xuat toan bo danh sach CD");
        System.out.print("Nhap lua chon: ");
        x = scanner.nextInt();
        switch(x){
            case 1: dsCD.listcd();break;
            case 2: dsCD.tongBaihat();break;
            case 3: dsCD.tongGiaThanhCD();break;
            case 4: dsCD.sapXepGiamTheoGia();break;
            case 5: dsCD.sapXepTangTheoTua();break;
            case 6: dsCD.xuatDS();break;
        }
    }while(x != 0);
    }
}
