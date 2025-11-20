package questions;

public class Tester implements BonusCalculator {

    String name;
    int salary;

    Tester(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateBonus(double salary) {
        return salary*(.10);

    }

    @Override
    public double calculateAllowance(double salary) {

        return salary*(.08);

    }

}
