package DecoratorPattern;

public class TruongPhongAllowance extends  EmployeeDecorator{
    public TruongPhongAllowance(EmployeeComponent employee) {
        super(employee);
    }

    public double getSalary() {
        return employee.getSalary() + 1000;
    }

    public String getDescription() {
        return employee.getDescription() + " + Truong Phong Allowance";
    }

}