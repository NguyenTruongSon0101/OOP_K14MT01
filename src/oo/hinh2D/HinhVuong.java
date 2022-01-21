package oo.hinh2D;

public class HinhVuong {
    //attribute
    String fileAmThanh;

    //method
    
    public HinhVuong(String amThanh){
        
        this.fileAmThanh = amThanh;
    }

    void xoay(){
        System.out.println("xoay hinh vuong ");
    }

    void phatNhac(){
        
        System.out.println("rang: "+fileAmThanh);
    }
}
