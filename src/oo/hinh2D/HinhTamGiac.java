package oo.hinh2D;

public class HinhTamGiac {
    
    String fileAmThanh;

    

    public HinhTamGiac(String amThanh){
        
        this.fileAmThanh = amThanh;
    }

    void xoay(){
        System.out.println("xoay hinh tam giac ");
    }

    void phatNhac(){
        
        System.out.println("rang "+fileAmThanh);
    }
}
