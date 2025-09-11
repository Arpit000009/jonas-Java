 import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = s.nextInt();
        int a[] = new int[size];
        System.out.println("enter the values");
        for(int i=0;i<a.length;i++){
            a[i] = s.nextInt();
        }
        System.out.println("the values of array in reverse are:");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        s.close();
    }
    
    
}
