package oo.hinh2D;

public class hinhTestDrive {
    public static void main(String[] args) {
        HinhTamGiac hinhTamGiac;
        hinhTamGiac = new HinhTamGiac("tit tit tit.mp3");
        hinhTamGiac.xoay();
        hinhTamGiac.phatNhac();

        HinhTron hinhTron;
        hinhTron = new HinhTron("reng reng reng.mp3");
        hinhTron.xoay();
        hinhTron.phatNhac();        

        HinhVuong hinhVuong;
        hinhVuong = new HinhVuong("ting ting ting.mp3");
        hinhVuong.xoay();
        hinhVuong.phatNhac();
    }
}
