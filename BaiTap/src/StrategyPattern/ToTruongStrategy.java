package StrategyPattern;

public class ToTruongStrategy implements SalaryStrategy{
    @Override
    public double calSalary(double salary) {
        return salary + 700;
    }
}
