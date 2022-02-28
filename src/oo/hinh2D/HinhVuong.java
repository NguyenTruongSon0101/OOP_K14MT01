package oo.hinh2D;

public class HinhVuong {
    //attribute

    //implementtation
    private String fileAmThanh;


    //interface
    public void setfileAmThanh(String fileAmThanh){
        this.fileAmThanh = fileAmThanh;
    }

    public String getfileAmThanh(){
        return this.fileAmThanh;
    }

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
