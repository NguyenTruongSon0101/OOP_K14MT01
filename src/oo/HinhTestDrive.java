package oo;

public class HinhTestDrive {
    public static void main(String[] args) {
        Hinh hinhTron;
        hinhTron = new Hinh(5);
        hinhTron.xoayHinh();

        Hinh hinhVuong;
        hinhVuong = new Hinh(4, 1);
        hinhVuong.xoayHinh();

        Hinh hinhTamGiac;
        hinhTamGiac = new Hinh(3, 5);
        hinhTamGiac.xoayHinh();
    }
}
