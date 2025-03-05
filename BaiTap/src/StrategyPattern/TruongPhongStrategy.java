package StrategyPattern;

public class TruongPhongStrategy  implements SalaryStrategy{
    @Override
    public double calSalary(double salary) {
        return salary + 500;
    }
}
