package module3.class_27_10_2025;
import java.util.LinkedHashSet;
import java.util.Scanner;
//visit website
//view history
//clear

//utilize vector method
//custom exception
//utilize all methods liskedhashset

public class browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String>history = new LinkedHashSet<String>();
        
        do{
            System.out.println("1.visit website");
            System.out.println("2.view history");
            System.out.println("3.clear history");
            System.out.println("4.exit");

            System.out.println("enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                System.out.println("enter website url: ");
                String url = sc.nextLine();
                if(history.add(url)){
                    System.out.println("visited: " + url);
                }
                else{
                    System.out.println("you already visited this site");
                }
                break;
                case 2:
                if(history.isEmpty()){
                    System.out.println("NO history available");
                }else{
                    System.out.println("\n browsing history");
                    System.out.println(history);
                }
                break;
                case 3:
                history.clear();
                System.out.println("history cleared");
                break;
                case 4: System.out.println("exiting browser");
                sc.close();
                System.exit(0);
                break;
                default:
                System.out.println("invalid input, enter valid input");
            }

        } while (true);
    }
    
}
