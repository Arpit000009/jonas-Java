package questions;

public class Developer implements BonusCalculator {

    String name;
    int salary;

    Developer(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateBonus(double salary) {
        return salary*(.15);

    }

    @Override
    public double calculateAllowance(double salary) {
        return salary*(.10);

    }

}
