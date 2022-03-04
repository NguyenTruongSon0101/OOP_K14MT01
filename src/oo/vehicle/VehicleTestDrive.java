package oo.vehicle;

public class VehicleTestDrive {
    public static void main(String[] args) {
        
        Vehicle xe1 = new Vehicle();
        Vehicle xe2 = new Vehicle();
        Vehicle xe3 = new Vehicle();
        
        xe1.nhap();
        xe2.nhap();
        xe3.nhap();
        xe1.tax();
        xe2.tax();
        xe3.tax();
        System.out.println("Xe1: "+xe1.toString());
        System.out.println("Xe2: "+xe2.toString());
        System.out.println("Xe3: "+xe3.toString());
        

        
    }
}
