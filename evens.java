import java.util.Scanner;

public class evens {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("enter the values");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("the even numbers are:");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        s.close();
    }

}
