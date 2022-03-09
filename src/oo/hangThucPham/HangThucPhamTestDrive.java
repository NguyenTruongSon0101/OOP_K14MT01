package oo.hangThucPham;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class HangThucPhamTestDrive {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
       
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        
        String ngay1 = "08/03/2022";
        String ngay2 = "12/12/2022";
        HangThucPham htp1 = new HangThucPham("123456", "thit", 100000,simpleDateFormat.parse(ngay1),simpleDateFormat.parse(ngay2));
        System.out.println(htp1);
        if(htp1.kiemTraHetHan()){
            System.out.println("Het han!!!");}
        else{
            System.out.println("con hạn !!");
        }
    }
}

