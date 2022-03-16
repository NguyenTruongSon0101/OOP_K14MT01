package oo.kiemTraGiuaKy;

public class ListCD {
    private CD[] CD = new CD[10];
    private int countCD;
    private double sum = 0, sum1 = 0;
    public void listCD(){
        countCD = 0;
        for(int i = 0; i < 10; i++){
            CD[i] = new CD();
        }
    }

    public void listcd(){
        if(countCD > 10){
            System.out.println("Khong the them CD !!!");
        }else{ 
            CD[countCD] = new CD();
                CD cd = new CD();
                cd.nhap();
                CD[countCD] = cd;
        countCD++;       
        }
        
    }
    //Tinh so luong CD co trong danh sach
    public void tongBaihat(){
        for(int i = 0; i < countCD; i++){
            this.sum += CD[i].getSoBaiHat(); 
        }System.out.println("So bai hat: "+this.sum);
    }
    //TInh tong gia thanh cua cac CD
    public void tongGiaThanhCD(){
        for(int i = 0; i < countCD; i++){
            this.sum1 += CD[i].getGiaThanh();
        }System.out.println("Tong gia CD: "+this.sum1);
    }
    //Sap xep giam theo gia
    public void sapXepGiamTheoGia(){
        CD temp = CD[0];
        for(int x = 0; x < countCD; x++){
            
            for(int y = x +1; y < countCD; y++){
                if(CD[x].getGiaThanh() < CD[y].getGiaThanh()){
                    temp = CD[y];
                    CD[y] = CD[x];
                    CD[x] = temp;
                }
            }
        }
        for(int i = 0; i < countCD; i++){
            
            System.out.println(CD[i].toString());
        }
    }

    //Sap xep tang theo tua CD
    public void sapXepTangTheoTua(){
        CD temp = CD[0];
        for(int x = 0; x < countCD; x++){
            
            for(int y = x +1; y < countCD; y++){
                if(CD[x].getTuaCD().compareTo(CD[y].getTuaCD()) > 0){
                    temp = CD[y];
                    CD[y] = CD[x];
                    CD[x] = temp;
                }
            }
        }
        for(int i = 0; i < countCD; i++){
            
            System.out.println(CD[i].toString());
        }
    }


    //Xuat danh sach CD
    public void xuatDS(){
        for(int i = 0; i < countCD; i++){
            System.out.println("------------------------------");
            System.out.println(CD[i].toString());
        }
    }


}
