package oo;

public class Account {
    //data
    int soTK = 2005110011;
    int soDu = 50000;

    //function
    void inThongTin(){
        System.out.println("Thong tin tai khoan");
        System.out.println("so tai khoan: "+soTK);
        System.out.println("so du: "+soDu);
    }

    void guiTien(int soTien){
        soDu += soTien;
    }

    void rutTien(int soTien){
        soDu -= soTien;
    }

    

}
