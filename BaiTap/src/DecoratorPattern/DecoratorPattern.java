package DecoratorPattern;

public class DecoratorPattern {
    public static void main(String[] args) {
        EmployeeComponent emp = new employee("443", "ADuong", 4300);

        emp = new TienSiAllowance(emp);
        System.out.println(emp.getDescription()+ " = " + emp.getSalary()+"K");
    }
}
