package oo;

public class Hinh {
    //
    int soCanh;
    int doDaiCanh;
    int banKinh;

    //
    public Hinh(){

    }

    public Hinh(int soCanh, int doDaiCanh){
        this.soCanh = soCanh;
        this.doDaiCanh = doDaiCanh;
    }

    public Hinh(int banKinh){
        this.banKinh = banKinh;
    }

    void xoayHinh(){
        if(soCanh == 0){
            System.out.println("chay di");
        }else{
            if(soCanh == 3){
                System.out.println("chay...dung");
            }else{
                if(soCanh == 4){
                    System.out.println("dung im");
                }
            }
        }
            
    }
}
