package questions;
import java.util.Scanner;

public class employeeManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter (1 for manager,2 for developer,3 for tester): ");
        int n = sc.nextInt();
        BonusCalculator employee = null;
        System.out.println("enter name of employee");
        String name = sc.next();
        System.out.println("enter salary of employee");
        int salary = sc.nextInt();
        switch (n) {
            case 1:
                employee = new Manager(name, salary);
                
                break;
            case 2:
                employee = new Developer(name, salary);
                break;
            case 3:
                employee = new Tester(name, salary);
                break;
            
            default:
                break;
        }

        System.out.println("name of employee: "+name);
        System.out.println("salary of employee: "+salary);
        System.out.println("allowance: "+ employee.calculateAllowance(salary));
        System.out.println("bonus: "+employee.calculateBonus(salary));
        System.out.println("total salary: "+(salary+employee.calculateAllowance(salary)+employee.calculateBonus(salary)));

        sc.close();
    }
}
