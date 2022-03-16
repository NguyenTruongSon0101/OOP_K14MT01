package oo.kiemTraGiuaKy;

import java.util.Scanner;

public class CD {
    Scanner scanner = new Scanner(System.in);
    //implementtation
    private int maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private float giaThanh;
    //interfaces
    //contructor
    public CD(){
        this.maCD = 0;
        this.tuaCD = "";
        this.caSy = "";
        this.soBaiHat = 0;
        this.giaThanh = 0f;
    }
    public CD(int maCD, String tuaCD, String caSy, int soBaiHat, float giaThanh){
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.setSoBaiHat(soBaiHat);
        this.setGiaThanh(giaThanh);
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }
    public int getMaCD() {
        return maCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }
    public String getTuaCD() {
        return tuaCD;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }
    public String getCaSy() {
        return caSy;
    }

    public void setSoBaiHat(int soBaiHat) {
        if(soBaiHat > 0){
            this.soBaiHat = soBaiHat;
        }else
            System.out.println("So bai hat phai lon hon 0!");
        
    }
    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setGiaThanh(float giaThanh) {
        if(giaThanh > 0){
            this.giaThanh = giaThanh;
        }else
            System.out.println("Gia thanh phai lon hon 0!");
        
    }
    public float getGiaThanh() {
        return giaThanh;
    }

    public void nhap(){
        System.out.print("Nhap ma CD: ");
        this.maCD = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap tua CD: ");
        this.tuaCD = scanner.nextLine();
        System.out.print("Nhap ten ca sy: ");
        this.caSy = scanner.nextLine();
        System.out.print("Nhap so bai hat: ");
        this.soBaiHat = scanner.nextInt();
        System.out.print("Nhap gia thanh: ");
        this.giaThanh = scanner.nextFloat();
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Ma CD: "+this.maCD + "\tTua CD: " +this.tuaCD + "\tCa si: "+this.caSy+"\tSo bai hat: "+this.soBaiHat+"\tGia thanh: "+this.giaThanh;
    }
}
