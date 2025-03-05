package DecoratorPattern;

public class ToTruongAllowance  extends  EmployeeDecorator{
    public ToTruongAllowance(EmployeeComponent employee) {
        super(employee);
    }

    public double getSalary() {
        return employee.getSalary() + 500;
    }

    public String getDescription() {
        return employee.getDescription() + " + To Truong Allowance";
    }

}
