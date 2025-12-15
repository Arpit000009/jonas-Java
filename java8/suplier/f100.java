package java8.suplier;

import java.util.function.Supplier;

//write a java program to return a number 100
public class f100 {
    public static void main(String[] args) {
        Supplier<Integer> s1 = ()-> 100;

        System.out.println(s1.get());
    }
}
