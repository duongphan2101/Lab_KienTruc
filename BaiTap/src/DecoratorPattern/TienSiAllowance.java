package DecoratorPattern;

public class TienSiAllowance extends  EmployeeDecorator{
    public TienSiAllowance(EmployeeComponent employee) {
        super(employee);
    }

    public double getSalary() {
        return employee.getSalary() + 1500;
    }

    public String getDescription() {
        return employee.getDescription() + " + Tien Si Allowance";
    }

}
