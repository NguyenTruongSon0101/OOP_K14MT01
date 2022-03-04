package oo.hinh2D;

public class hinhTestDrive {
    public static void main(String[] args) {
        HinhTamGiac hinhTamGiac;
        hinhTamGiac = new HinhTamGiac();
        hinhTamGiac.xoay();
        hinhTamGiac.setfileAmThanh("hinhVuong.aif");
        hinhTamGiac.phatNhac();

        HinhTron hinhTron;
        hinhTron = new HinhTron();
        hinhTron.xoay();
        hinhTron.setfileAmThanh("hinhTron.aif");        
        hinhTron.phatNhac();
  
        HinhVuong hinhVuong;
        hinhVuong = new HinhVuong();
        hinhVuong.xoay();
        hinhVuong.setfileAmThanh("hinhTamGiac.aif");
        hinhVuong.phatNhac();

        HinhTrungBienHinh hinhTrungBienHinh = new HinhTrungBienHinh();
        hinhTrungBienHinh.setXpoint(5);
        hinhTrungBienHinh.setyPoint(7);
        hinhTrungBienHinh.xoay();
        hinhTrungBienHinh.setfileAmThanh("amoeba.hif");
        hinhTrungBienHinh.phatNhac();
    }
}
