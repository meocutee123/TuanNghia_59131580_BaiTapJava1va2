package mypack;
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
}

