package oo.hangThucPham;
import java.text.SimpleDateFormat;
import java.util.Date;
public class HangThucPham {
    //attribute
    //emplementtation
    private String maHang;
    private String tenHang;
    private float donGia;
    private Date ngaySanXuat;
    private Date ngayHetHan;

    //contructor
    //interface
    public HangThucPham(String maHang){
        this.setmaHang(maHang);
    }
    public HangThucPham(String maHang, String tenHang, float dongGia, Date ngaySanXuat, Date ngayHetHan){
        this(maHang);
        this.setTenHang(tenHang);
        this.setDonGia(donGia);
        this.setNgaySanXuat(ngaySanXuat);
        this.setNgayHetHan(ngayHetHan);
        
    }

    

    private void setmaHang(String maHang){
        if(maHang != ""){
            this.maHang = maHang;
        }else
            System.out.println("Ma hang khong duoc rong!");
        
    }
    
    public void setTenHang(String tenHang) {
        if(tenHang != ""){
            this.tenHang = tenHang;
        }else
            System.out.println("Ten hang khong duoc rong");
    }

    public void setDonGia(float donGia) {
        if(donGia > 0){
            this.donGia = donGia;
        }else  
            System.out.println("Don gia phai > 0 !");
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        if(ngaySanXuat != null){
            this.ngaySanXuat = ngaySanXuat;
        }else
            System.out.println("Ngay nhap kho phai khac rong!");
    }
    public void setNgayHetHan(Date ngayHetHan) {
        if(ngayHetHan.after(this.ngaySanXuat)){
            this.ngayHetHan = ngayHetHan;
        }else
            System.out.println("Ngay khong hop le!");
    }

    boolean kiemTraHetHan(){
        boolean isHetHan = false; //còn hạn
        Date hienTai = new Date(); //ngay hien tai
        if(this.ngayHetHan.before(hienTai)){
            isHetHan = true;
        }else{
            isHetHan =false;
        }
        return isHetHan;
    }

    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String str = "Ma hang: "+this.maHang + " Ten hang: "+this.tenHang;
        str += "Don gia: "+this.donGia;
        str += "Ngay SX: "+simpleDateFormat.format(this.ngaySanXuat);
        str += "Ngay Het Han: "+simpleDateFormat.format(this.ngayHetHan);
        return str;
    }
    
}
