package oo.chuyenXe;

public class ListChuyenXe {
    private ChuyenXe[] CX = new ChuyenXe[10];
    private int countCX;
    private double sum1 = 0, sum2 = 0;
    public void listCX(){
        countCX = 0;
        for(int i = 0; i < 10 ; i++){
            CX[i] = new ChuyenXe();
        }
    }

    public void listcx(int temp){
        if(countCX > 100)
            System.out.println("khong the them du lieu");
        else{
            if(temp == 1){
                CX[countCX] = new ChuyenXeNoiThanh();
                ChuyenXeNoiThanh noit = new ChuyenXeNoiThanh();
                noit.nhap();
                CX[countCX] = noit;
                sum1 += noit.getDoanhThu();
            }
            else{
                CX[countCX] = new ChuyenXeNgoaiThanh();
                ChuyenXeNgoaiThanh ngoait = new ChuyenXeNgoaiThanh();
                ngoait.nhap();
                CX[countCX]= ngoait;
                sum2 += ngoait.getDoanhThu();
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
        System.out.println("chuyen xe noi thanh: "+sum1 + "|");
        System.out.println("chuyen xe ngoai thanh: "+sum2+"|");
        System.out.println("------------------------");
    }
}
