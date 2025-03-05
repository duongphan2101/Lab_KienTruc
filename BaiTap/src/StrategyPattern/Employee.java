package StrategyPattern;

public class Employee {
    private String id;
    private String name;
    private double salary;
    private SalaryStrategy salaryStrategy;

    public Employee(SalaryStrategy salaryStrategy, double salary, String name, String id) {
        this.salaryStrategy = salaryStrategy;
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public void setSalaryStrategy(SalaryStrategy salaryStrategy) {
        this.salaryStrategy = salaryStrategy;
    }

    public double getSalary() {
        return salaryStrategy.calSalary(salary);
    }

    public void printSalary() {
        System.out.println(name + " - Lương: " + getSalary() + "K");
    }
}
