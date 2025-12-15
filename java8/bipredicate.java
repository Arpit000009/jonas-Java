package java8;

import java.util.function.BiPredicate;

//write a java program to check if sum of two numbers is even
public class bipredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> isSumEven = (a,b)->(a+b)%2==0;
        System.out.println(isSumEven.test(10, 20));
    }
}
