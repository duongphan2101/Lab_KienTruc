package StatePattern;

public class StatePattern {
    public static void main(String[] args) {
        employee emp = new employee("422", "ADuong", 7000, new TienSi());
        System.err.println(emp.toString());

    }
}
