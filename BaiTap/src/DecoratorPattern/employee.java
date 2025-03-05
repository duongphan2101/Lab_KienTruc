package DecoratorPattern;

public class employee implements EmployeeComponent{
    private String id;
    private String name;
    private int salary;

    public employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getDescription() {
        return name + " (Base Salary: " + salary + "K)";
    }

}
