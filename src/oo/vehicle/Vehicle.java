package oo.vehicle;

import java.util.Scanner;

public class Vehicle {
    Scanner scanner = new Scanner(System.in);
    //attribute
    //emplementtation
    private int xyLanh;
    private double cost;
    private float tax;

    //constructor
    public Vehicle(){

    }
    public Vehicle(int xyLanh, double cost){
        this.xyLanh = xyLanh;
        this.cost = cost;
    }
    //method 
    //interfaces
    public void setxyLanh(int xyLanh){
        this.xyLanh = xyLanh;
    }
    public int getxyLanh(){
        return this.xyLanh;
    }

    public void setcost(double cost){
        this.cost = cost;
    }
    public double getcost(){
        return this.cost;
    }
    public void settax(float tax){
        this.tax = tax;
    }
    public float gettax(){
        return this.tax;
    }

    public void nhap(){
        System.out.println("Nhap XyLanh xe: ");
        this.xyLanh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gia xe: ");
        this.cost = scanner.nextDouble();
        scanner.nextLine();
    }
    
    public float tax(){
        if(this.xyLanh < 100){
            tax = (float) (cost *(1/100));
        }else{
            if(this.xyLanh >= 100 && this.xyLanh < 200){
                tax = (float) (cost *(3/100));
            }else{
                if(this.xyLanh > 200){
                    tax = (float) (cost *(5/100));
                }
            }      
        }
        return tax;
    }

    public String toString(){
        String str = "Xylanh: "+this.xyLanh+ ". Gia: "+this.cost ;
        str = str + ". Thue: " +this.tax();
        return str ;
    }
        
    
}
