package oo.tieuLuanCuoiKy;

public class HangDienMay extends HangHoa {
    // implementtation
    private double thoiGianBH;
    private double congSuat;

    // interfaces
    public HangDienMay() {

    }

    public HangDienMay(String maHang, String tenHang, int soLuongTonKho, double donGia, double thoiGianBH,
            double congSuat) {
        super(maHang, tenHang, soLuongTonKho, donGia);
        setThoiGianBH(thoiGianBH);
        setCongSuat(congSuat);
    }

    public void setThoiGianBH(double thoiGianBH) {
        if (thoiGianBH >= 0) {
            this.thoiGianBH = thoiGianBH;
        } else {
            System.out.println("thoi gian bao hanh phai lon hon hoac bang 0 !");
        }
    }

    public double getThoiGianBH() {
        return thoiGianBH;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        if (congSuat > 0) {
            this.congSuat = congSuat;
        } else {
            System.out.println("cong suat phai lon hon 0 !");
        }
    }

    @Override
    public void nhap() {
        // TODO Auto-generated method stub
        super.nhap();
        System.out.print("Nhap thoi gian bao hanh: ");
        this.thoiGianBH = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap cong suat: ");
        this.congSuat = scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    public double tinhVAT(double VAT) {
        // TODO Auto-generated method stub
        return super.tinhVAT(VAT);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " TG bao hanh: " + this.thoiGianBH + "|" + " Cong suat: " + this.congSuat;
    }

    @Override
    public void danhGiaMucDoBuonBan() {
        // TODO Auto-generated method stub
        if (getSoLuongTonKho() < 3) {
            System.out.println("Ban duoc : " + toString());
        }
    }
}
