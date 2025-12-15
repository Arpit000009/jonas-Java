package java8.consumer;

import java.util.function.Consumer;

//write a java program to print each element of an array
public class uppar {


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Consumer<int[]> print_array = arr2 ->{
            for(int i=0;i<arr.length;i++){
                System.out.println(arr2[i]);
            }
        };
        print_array.accept(arr);
        }
    

}