package java8.suplier;

import java.util.function.Supplier;

//java program to return sum of two numbers
public class sum {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        Supplier<Integer> s1 = () -> a+b;
        System.out.println(s1.get());
    }
}
