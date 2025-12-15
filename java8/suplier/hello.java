package java8.suplier;

import java.util.function.Supplier;

//write a java program to print a message to print java 8;
public class hello {
    public static void main(String[] args) {
        Supplier<String> s1 = ()-> "Hello Java 8";
        System.out.println(s1.get());
    }
}
