package class_25_09_2025;
import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter the bill amount: ");
        int billamount = s.nextInt();
        s.nextLine();
        System.out.println("Enter today's date(enter in DD-MM-YYYY): ");
        String Tdate = s.nextLine();
        System.out.println("Enter your birthday(enter in DD-MM-YYYY): ");
        String birthday = s.nextLine();
        System.out.println("are you loyalaity member(enter true or false)");
        boolean mem = s.nextBoolean();
        s.close();

        if((billamount>=5000) || (Tdate.equals(birthday))|| (mem == true)){
            System.out.println("you are eligible for discount");
        }
        else{
            System.out.println("you age not eligible for discount");
        }
    }

}
