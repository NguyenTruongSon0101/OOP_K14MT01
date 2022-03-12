package oo.vehicle;

import java.util.Scanner;

public class VehicleTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Vehicle xe1 = new Vehicle("Nguyen Truong Son", "AB",100, 25_000_000);
        Vehicle xe2 = new Vehicle("Le Minh Tinh", "Ford Ranger", 300, 500_000_000);
        Vehicle xe3 = new Vehicle("Nguyen Minh Triet", "LandScape", 1500, 2_000_000_000);

        System.out.println("Chu xe: \t\t\tLoai xe: \tDung tich: \tTri Gia: \t\tThue: ");
        System.out.println("=====================================================================================================");
        System.out.printf("%-20s %13s %16d %27.2f %21f\n",xe1.gettenChuXe(),xe1.getloaiXe(),xe1.getxyLanh(),xe1.getcost(),xe1.tax());
        System.out.printf("%-20s %13s %16d %27.2f %21f\n",xe2.gettenChuXe(),xe2.getloaiXe(),xe2.getxyLanh(),xe2.getcost(),xe2.tax());
        System.out.printf("%-20s %13s %16d %27.2f %21f",xe3.gettenChuXe(),xe3.getloaiXe(),xe3.getxyLanh(),xe3.getcost(),xe3.tax());




        
    }
}
