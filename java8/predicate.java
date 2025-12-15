package java8;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        int [] arr = {11,20,33,40,55};

        Predicate<Integer> isEven = n ->n%2==0;
        for(int i:arr){
            if(isEven.test(i)){
                System.out.println(i);
            }
        }
    }
}
