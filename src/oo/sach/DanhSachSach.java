package oo.sach;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSach {
    private List<Sach> sach = new ArrayList<>();

    public void them(Sach sachs){
        sach.add(sachs);
    }

    public void inDanhSach(){
        for (Sach sach2 : sach) {
            System.out.println(sach2);
        }
    }
    


}
