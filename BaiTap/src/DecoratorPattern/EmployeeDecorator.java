package DecoratorPattern;

public abstract class EmployeeDecorator implements EmployeeComponent{
    protected EmployeeComponent employee;

    public EmployeeDecorator(EmployeeComponent employee){
        this.employee = employee;
    }

    public double getSalary() {
        return employee.getSalary();
    }

    public String getDescription() {
        return employee.getDescription();
    }

}
