package oo.chuyenXe;

public class ListChuyenXe {
    private ChuyenXe[] CX = new ChuyenXe[10];
    private int countCX;
    private int dem1 = 0 , dem2 = 0;
    private double sum1 = 0, sum2 = 0;
    public void listCX(){
        countCX = 0;
        for(int i = 0; i < 10 ; i++){
            CX[i] = new ChuyenXe();
        }
    }

    public void listcx(int temp){
        if(countCX > 10)
            System.out.println("khong the them du lieu");
        else{
            if(temp == 1){
                CX[countCX] = new ChuyenXeNoiThanh();
                ChuyenXeNoiThanh noit = new ChuyenXeNoiThanh();
                noit.nhap();
                CX[countCX] = noit;
                sum1 += noit.getDoanhThu();
                dem1 += 1;
            }
            else{
                CX[countCX] = new ChuyenXeNgoaiThanh();
                ChuyenXeNgoaiThanh ngoait = new ChuyenXeNgoaiThanh();
                ngoait.nhap();
                CX[countCX]= ngoait;
                sum2 += ngoait.getDoanhThu();
                dem2 += 1;
            }
            countCX++;
        }
    }
    public void xuattt(){
        for(int i = 0; i< countCX; i++){
            System.out.println("----------------------");
            System.out.println(CX[i].toString());
        }
        System.out.println("--------Doanh Thu-------");
        System.out.println("chuyen xe noi thanh: "+sum1 +"|"+ " so chuyen: "+dem1);
        System.out.println("chuyen xe ngoai thanh: "+sum2+"|"+" so chuyen: "+dem2);
        System.out.println("------------------------");
    }
}
