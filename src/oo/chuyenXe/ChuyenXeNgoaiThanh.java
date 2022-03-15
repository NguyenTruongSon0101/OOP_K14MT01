package oo.chuyenXe;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDiDuoc;
    Scanner scanner = new Scanner(System.in);

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }
    public String getNoiDen() {
        return noiDen;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }
    public ChuyenXeNgoaiThanh(){
        super();
        this.noiDen = "";
        this.soNgayDiDuoc = 0; 
    }

    public ChuyenXeNgoaiThanh(int maSoChuyen, String hoTenTaiXe, int soXe, String noiDen, int soNgayDiDuoc){
        super(maSoChuyen,hoTenTaiXe,soXe);
        this.soNgayDiDuoc = soNgayDiDuoc;
        this.noiDen = noiDen;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Noi den: ");
        this.noiDen = scanner.nextLine();
        System.out.print("So ngay: ");
        this.soNgayDiDuoc = soNgayDiDuoc;
        this.soNgayDiDuoc = scanner.nextInt();
        scanner.nextLine();
    }

    public String toString(){
        return "chuyen xe ngoai thanh"+super.toString() + "\nNoi den: "+this.noiDen +"\nSo Ngay: "+this.soNgayDiDuoc+"\nDoanh thu"+this.doanhThu;
    }

}
