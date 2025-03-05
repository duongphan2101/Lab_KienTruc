package StatePattern;

public class employee {
    private String id;
    private String name;
    private double salary;
    private PositionState position;

    public employee(String id, String name, double salary, PositionState position) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public void setPosition(PositionState position) {
        this.position = position;
    }

    public double tinhLuong(){
        return salary + position.getAllowance();
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name +
                ", salary=" + salary +
                ", position=" + position.getChucVu() +
                ", Phu Cap=" +position.getAllowance() +
                ", Tong Luong=" +tinhLuong();
    }
}
