import java.util.ArrayList;
import java.util.Collection;

import mypack.NhanVien;

public class QuanLySinhVien implements IQuanLy {
    ArrayList<String> listNhanVien = new ArrayList<>();

    public void them(NhanVien nv) {
        listNhanVien.addAll((Collection<? extends String>) nv);
    }
    public void inDS() {
       // listNhanVien.forEach(nv ->System.out.println(nv.getThongTin()));
    }
}