package class_25_09_2025;
import java.util.Scanner;

public class arr {

    static boolean find(int arr[],int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("enter the element to find ");
        int element = s.nextInt();
        if(find(arr, element)){
        System.out.println("element is present");
        }
        else{
            System.out.println("element is not present");
        }
        s.close();

    }
}
