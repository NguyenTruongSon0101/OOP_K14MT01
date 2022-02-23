package oo.hinh2D;

public class HinhTron {
    //attribute
    //implementtation
    private String fileAmThanh;


    //interfaces
    public void setfileAmThanh(){
        this.fileAmThanh = fileAmThanh;
    }

    public String getfileAmThanh(){
        return this.fileAmThanh;
    }

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
