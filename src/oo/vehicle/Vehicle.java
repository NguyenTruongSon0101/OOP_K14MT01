package oo.vehicle;

import java.util.Scanner;

public class Vehicle {
    Scanner scanner = new Scanner(System.in);
    //attribute
    //emplementtation

    private String tenChuXe;
    private String loaixe;
    private int xyLanh;
    private double cost;
    

    //constructor
    public Vehicle(){
        this.tenChuXe = null;
        this.loaixe = null;
        this.xyLanh = 0;
        this.cost = 0;

    }
    public Vehicle(String tenChuXe, String loaixe, int xyLanh, double cost){
        this.tenChuXe = tenChuXe;
        this.loaixe = loaixe;
        this.xyLanh = xyLanh;
        this.cost = cost;
    }
    //method 
    //interfaces
    public void settenChuXe(String tenChuXe){
        this.tenChuXe = tenChuXe;
    }
    public String gettenChuXe(){
        return this.tenChuXe;
    }

    public void setloaiXe(String loaiXe){
        this.loaixe = loaiXe;
    }
    public String getloaiXe(){
        return this.loaixe;
    }
    
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
    

    public void nhap(){
        System.out.println("Nhap chu xe: ");

        System.out.println("Nhap XyLanh xe: ");
        this.xyLanh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap gia xe: ");
        this.cost = scanner.nextDouble();
        scanner.nextLine();
    }
    
    public float tax(){
        float tax = 0.0f;
        if(this.xyLanh < 100){
            tax = (float) (this.cost *0.01);
        }else{
            if(this.xyLanh >= 100 && this.xyLanh < 200){
                tax = (float) (this.cost *0.03);
            }else{
                if(this.xyLanh >= 200){
                    tax = (float) (this.cost *0.05);
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
        
    void menu(){
        
        int suLuaChon;
        do{
            System.out.println("------------------MENU------------------");
            System.out.println("1. .");
            System.out.println("2. .");
            System.out.println("3. Thoat.");
            
            System.out.println("------------------MENU------------------");
            suLuaChon = scanner.nextInt();
            switch(suLuaChon){
                case 1:break;
                case 2:break;
                default: System.out.println("");
            }}while(suLuaChon >= 1 && suLuaChon <= 2);
    }
    
}
