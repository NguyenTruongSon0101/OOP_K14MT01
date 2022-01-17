package oo;

public class Employee {
    // data
    int maNV = 001;
    String tenNV = "Nguyen Van A";
    String congTac = "chi nhanh Thu Duc";
    int luongCoBan = 5000000;

    //function
    void inThongTin(){
        System.out.println("thong tin nhan vien");
        System.out.println("Ten nhan vien: "+tenNV);
        System.out.println("Ma nhan vien: "+maNV);
        System.out.println("Noi cong tac: "+congTac);
    }

    void tinhLuong(int heSoLuong){
        int thucLanh = heSoLuong * luongCoBan;
        System.out.println("Luong nhan vien: "+thucLanh);
    }

    
}
