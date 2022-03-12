package oo.sinhVien;



public class SinhVienTestDrive {
    
    public static void main(String[] args) {
    SinhVien sv1 = new SinhVien(123456, "Nguyen Truong Son", 7, 8);
    SinhVien sv2 = new SinhVien(123789, "Le Thanh Tung", 8, 9);
    SinhVien sv3 = new SinhVien();
    sv3.nhap();
    

    System.out.printf("MSSV: %d,\tHo ten: %s,\tDiem TB : %f",sv1.getmaSV(),sv1.gethoTen(),sv1.tinhDiemTB());
    System.out.printf("\nMSSV: %d,\tHo ten: %s,\tDiem TB : %f",sv2.getmaSV(),sv2.gethoTen(),sv2.tinhDiemTB());
    System.out.printf("\nMSSV: %d,\tHo ten: %s,\tDiem TB: %f",sv3.getmaSV(),sv3.gethoTen(),sv3.tinhDiemTB());
    }
}