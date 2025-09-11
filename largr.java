import java.util.Scanner;

public class largr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("enter the values");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("the largest number is :");
        int largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] >largest) {
                largest = a[i];
            }
        }
        System.out.println(largest);
        s.close();
    }

}
