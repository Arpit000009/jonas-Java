package module3.class_17_10_2025.one;

import java.util.ArrayList;
import java.util.Scanner;

public class cricketerlist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter no of crickets to enter: ");
        int n = s.nextInt();
        int m = n;
        ArrayList<String>l1 = new ArrayList<String>(n);
        
        while(m!=0){
            String name = s.next();
            l1.add(name);
            m--;
        }
        s.close();

        System.out.println("list of cricketers" + l1);
    }
}
