import java.util.Scanner;
public class arrayin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[3];
        System.out.println("enter the values");
        for(int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        System.out.println("the values are:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        s.close();
    }
}
