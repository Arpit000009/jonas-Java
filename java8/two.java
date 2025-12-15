package java8;

import java.util.function.BiPredicate;

//write the program to check is the first string starts with second string or not
public class two {
    public static void main(String[] args) {
        BiPredicate<String,String> startswith = (str,prefix)->str.startsWith(prefix);

        System.out.println(startswith.test("javaprogramming","java"));
    }
}
