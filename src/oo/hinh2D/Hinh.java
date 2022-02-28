package oo.hinh2D;

public class Hinh {
    //implementtation
    private String fileAmThanh;


    //interfaces

    public void setfileAmThanh(String _fileAmThanh){
        this.fileAmThanh = _fileAmThanh;
    }

    public String getfileAmThanh(){
        return this.fileAmThanh;
    }

    public Hinh(){}
    public Hinh(String amThanh){
        
        this.fileAmThanh = amThanh;
    }

    void xoay(){
        System.out.println("xoay hinh 360 ");
    }

    void phatNhac(){
        
        System.out.println("rang: "+fileAmThanh);
    }
}
