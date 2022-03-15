package oo.chuyenXe;

import java.util.Scanner;

public class ChuyenXe {
    Scanner scanner = new Scanner(System.in);
    //implementation
    protected int maSoChuyen;
    protected String hoTenTaiXe;
    protected int soXe;
    protected double doanhThu;
    //interfaces

    protected ChuyenXe(){ 
        this.maSoChuyen =0;
        this.hoTenTaiXe = "";
        this.soXe = 0;
        this.doanhThu = 0;
    }

    protected ChuyenXe(int maSoChuyen, String hoTen, int soXe){
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTen;
        this.soXe = soXe;
        
    }

    protected void setMaSoChuyen(int maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }
    protected int getMaSoChuyen() {
        return maSoChuyen;
    }
    
    protected void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }
    protected String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    protected void setSoXe(int soXe) {
        this.soXe = soXe;
    }
    protected int getSoXe() {
        return soXe;
    }

    protected void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    protected double getDoanhThu() {
        return doanhThu;
    }

    protected void nhap(){
        System.out.print("Nhap ma so chuyen: ");
        this.maSoChuyen = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ho ten tai xe: ");
        this.hoTenTaiXe = scanner.nextLine();
        System.out.print("Nhap so xe: ");
        this.soXe = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap doanh thu: ");
        this.doanhThu = scanner.nextDouble();
    }
    public String toString(){
        return "\nMS chuyen: "+this.maSoChuyen + "\nTen tai xe: "+this.hoTenTaiXe+"\nSo xe: "+this.soXe;
    }
    

}
