package oo.hinh2D;

public class HinhTron {
    //attribute
    String fileAmThanh;

    //method

    public HinhTron(String amThanh){
        
        this.fileAmThanh = amThanh;
    }
    void xoay(){
        System.out.println("xoay hinh tron ");
    }

    void phatNhac(){
        
        System.out.println("rang "+fileAmThanh);
    }
    
}
