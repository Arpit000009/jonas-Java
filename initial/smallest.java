package initial;
import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = s.nextInt();
        int arr[] = new int[size];

        System.out.println("enter the numbers in array: ");
        for(int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }
        int smallest = arr[0];

        for(int i=1;i<size;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("smallest element in array is : "+smallest);
        s.close();
    }
}
