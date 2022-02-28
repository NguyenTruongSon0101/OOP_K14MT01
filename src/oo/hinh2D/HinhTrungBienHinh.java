package oo.hinh2D;

public class HinhTrungBienHinh extends Hinh{
    private int xpoint;
    private int yPoint;


    public void setXpoint(int xpoint) {
        this.xpoint = xpoint;
    }
    public int getXpoint() {
        return xpoint;
    }

    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }
    public int getyPoint() {
        return yPoint;
    }
    //override
    @Override
    public void phatNhac(){
        System.out.println("phat am thanh file .hif "+this.getfileAmThanh());
    }
    @Override
    public void xoay(){
        System.out.println("Xoay hinh theo diem x: "+this.xpoint +" "+this.yPoint);;
    }

}
