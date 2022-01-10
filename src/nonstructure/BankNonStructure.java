package nonstructure;

import java.util.Scanner;

public class BankNonStructure {
    public static void main(String[] args) {
        //data
        int soTK = 2005110011;
        int soDu = 50000;

        //operation
        // gui tien

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so tien gui: ");
        int soTien = input.nextInt();
        soDu += soTien;

        //thong tin tai khoan
        System.out.println("Thong tin tai khoan");
        System.out.println("so tai khoan: "+soTK);
        System.out.println("so du: "+soDu);

        //rut tien

        System.out.print("Nhap so tien rut: ");
        soTien = input.nextInt();
        soDu -= soTien;

        //thong tin tai khoan
        System.out.println("Thong tin tai khoan");
        System.out.println("so tai khoan: "+soTK);
        System.out.println("so du: "+soDu);

    }
}
