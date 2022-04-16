package oo.chuyenXe;

import java.util.Scanner;

public class ChuyenXeTestDrive {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        ListChuyenXe dscx = new ListChuyenXe();
        do{
            System.out.println("\n\t.---------------------");
            System.out.println("\t0.exit");
            System.out.println("\t1.Them chuyen xe noi thanh");
            System.out.println("\t2.Them chuyen xe ngoai thanh");
            System.out.println("\t3.Hien thi dnah muc chuyen xe");
            System.out.println("\t.------------------------");
            x = scanner.nextInt();
            switch(x){
                case 1: dscx.listcx(1);
                break;
                case 2:dscx.listcx(2);
                break;
                case 3:dscx.xuattt();
                break;

            }
        }while(x != 0);
        System.out.println("");
    }
}
