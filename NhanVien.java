public class NhanVien {
    private String Name;
    private int Age;
    private String Address;
    private double Salary;
    private int workHours;

    public String getName() {
        return Name;
    }
    public void setName(String newName){
        this.Name = newName;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int newAge) {
        this.Age = newAge;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String newAddress){
        this.Address = newAddress;
    }
    public double getSalary(){
        return Salary;
    }
    public void setSalary(double newSalary){
        this.Salary = newSalary;
    }
    public int getworkHours(){
        return workHours;
    }
    public void setworkHours(int newworkHours){
        this.workHours = newworkHours;
    }
    public String getThongTin(){
        return Name + " " + Age + " " + Address + " " + Salary + " " + workHours;
    }
    public double tinhThuong() {
        if (workHours >= 200) return Salary * 0.2;
        else if (workHours >= 100 && workHours < 200) return Salary * 0.1;
        else return 0;
    }
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
    }
}
