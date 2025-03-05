package StrategyPattern;

public class TienSiStrategy implements SalaryStrategy{
    @Override
    public double calSalary(double salary) {
        return salary + 1000;
    }
}
