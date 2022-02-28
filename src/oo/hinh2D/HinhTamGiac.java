package oo.hinh2D;

public class HinhTamGiac {
    
    //implementtation
    private String fileAmThanh;


    //interfaces
    public void setfileAmThanh(String fileAmThanh){
        this.fileAmThanh = fileAmThanh;
    }

    public String getfileAmThanh(){
        return this.fileAmThanh;
    }

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
