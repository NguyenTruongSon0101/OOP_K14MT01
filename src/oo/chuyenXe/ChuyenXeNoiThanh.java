package oo.chuyenXe;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKmDiDuoc;
    Scanner scanner = new Scanner(System.in);

    public ChuyenXeNoiThanh(){
        super();
        this.soTuyen = 0;
        this.soKmDiDuoc = 0;
    }
    public ChuyenXeNoiThanh(int maSoChuyen,String hoTenTaiXe, int soXe, int soTuyen, double soKmDiDuoc){
        super(maSoChuyen, hoTenTaiXe, soXe);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }
    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoKmDiDuoc(double soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }
    public double getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Nhap so tuyen: ");
        this.soTuyen = scanner.nextInt();
        this.soKmDiDuoc = scanner.nextDouble();
    }
    public String toString(){
        return "Chuyen xe noi thanh: "+super.toString()+ "\nSo tuyen: "+this.soTuyen+"\nSo Km: "+this.soKmDiDuoc+"\nDoanh thu: "+this.doanhThu;
    }
}
