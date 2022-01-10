package oo;

public class AccountTestDrive {
    public static void main(String[] args) {
    Account account;
    account = new Account();

    //gui tien
    account.guiTien(30000);
    account.inThongTin();
    
    //rut tien
    account.rutTien(25000);
    account.inThongTin();

    }
    
}
