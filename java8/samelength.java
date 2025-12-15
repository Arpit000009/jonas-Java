package java8;

import java.util.function.BiPredicate;

//write a java program to check is two array has same length
public class samelength {
    public static void main(String[] args) {
        BiPredicate<int[] ,int [] > samelen = (arr1,arr2)-> arr1.length==arr2.length;
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,40};

        System.out.println(samelen.test(arr1, arr2));
    }
}
