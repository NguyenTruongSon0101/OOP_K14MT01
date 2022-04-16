package oo.tieuLuanCuoiKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangSanhSu extends HangHoa {
    // implementtation
    private String nhaSX;
    private Date ngayNhapKho;

    // interfaces

    public HangSanhSu() {

    }

    public HangSanhSu(String maHang, String tenHang, int soLuongTonKho, double donGia, String nhaSX,
            Date ngayNhapKho) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        this.nhaSX = nhaSX;
        this.ngayNhapKho = ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    @Override
    public void nhap() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        // TODO Auto-generated method stub
        super.nhap();
        System.out.print("Nhap nha san xuat: ");
        this.nhaSX = scanner.nextLine();
        System.out.print("Ngay nhap kho: ");

        try {
            this.ngayNhapKho = simpleDateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public double tinhVAT(double VAT) {
        // TODO Auto-generated method stub
        return super.tinhVAT(VAT);
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        // TODO Auto-generated method stub
        return super.toString() + "Nha san xuat: " + this.nhaSX + "|" + "Ngay nhap kho: "
                + simpleDateFormat.format(this.ngayNhapKho);
    }

    public long tinhThoiGianLuuKho() {
        Date hienTai = new Date();
        long noDay = (hienTai.getTime() - ngayNhapKho.getTime()) / (24 * 3600 * 1000);
        return noDay;
    }

    @Override
    public void danhGiaMucDoBuonBan() {
        // TODO Auto-generated method stub
        if (getSoLuongTonKho() > 50 && tinhThoiGianLuuKho() > 10) {
            System.out.println("Ban cham: " + toString());
        }
    }
}
