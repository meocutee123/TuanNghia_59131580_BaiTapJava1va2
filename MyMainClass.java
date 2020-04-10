import mypack.NhanVien;
public class MyMainClass{
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        nv1.setName("Nguyen Tuan Nghia");
        nv1.setAge(19);
        nv1.setAddress("664/2 2/4 street");
        nv1.setSalary(1000);
        nv1.setworkHours(40);
        System.out.println(nv1.getName() + " " + nv1.getAge() + " " + nv1.getAddress() + " " + nv1.getSalary() + " " + nv1.getworkHours());
        System.out.println(nv1.tinhThuong());
    
        NhanVien nv2 = new NhanVien();
        nv2.setName("Nguyen Tuan Hung");
        nv2.setAge(18);
        nv2.setAddress("665/2 2/4 street");
        nv2.setSalary(1000);
        nv2.setworkHours(100);
        System.out.println(nv2.getName() + " " + nv2.getAge() + " " + nv2.getAddress() + " " + nv2.getSalary() + " " + nv2.getworkHours());
        System.out.println(nv2.tinhThuong());

        IQuanLy Mn = new QuanLySinhVien();
        Mn.them(nv1);
        Mn.them(nv2);
        Mn.inDS();
    }
}