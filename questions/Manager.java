package questions;

public class Manager implements BonusCalculator{

    String name;
    int salary;

    Manager(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double calculateBonus(double salary) {
        return salary*(.25);
       
    }

    @Override
    public double calculateAllowance(double salary) {
        return salary*(.15);

    }
    
}
