import java.util.ArrayList;
import mypack.NhanVien;

public class QuanLySinhVien implements IQuanLy {
    ArrayList<NhanVien> listNhanVien = new ArrayList<NhanVien>();

    @Override
    public void them(NhanVien nv) {
        listNhanVien.add(nv);
    }
    @Override
    public void inDS() {
       listNhanVien.forEach(nv ->System.out.println(nv.getThongTin()));
    }
}