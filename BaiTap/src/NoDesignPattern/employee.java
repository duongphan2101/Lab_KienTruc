package NoDesignPattern;

public class employee {
    private String id;
    private String name;
    private double salary;
    private ChucVu chucVu;

    public employee(String id) {
        this.id = id;
    }

    public employee(ChucVu chucVu, double salary, String name, String id) {
        this.chucVu = chucVu;
        this.salary = salary;
        this.name = name;
        this.id = id;
    }
    // Tính tổng lương
    public double tinhLuong() {
        double totalSalary = salary;
        totalSalary += chucVu.getAllowance();
        return totalSalary;
    }

    public void printSalary() {
        System.err.println(name + " - Lương: " + tinhLuong() + "K");
    }


}
