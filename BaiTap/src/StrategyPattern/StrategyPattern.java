package StrategyPattern;

public class StrategyPattern {
    public static void main(String[] args) {
        Employee emp = new Employee(new TienSiStrategy(), 5000, "ADuong", "777");
        emp.printSalary();
    }
}
