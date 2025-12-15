package java8.consumer;

import java.util.function.Consumer;

public class consumerchain {
    public static void main(String[] args) {
        Consumer<String>c1=s-> System.out.println("hello");
        Consumer<String>c2=s-> System.out.println("hello");

        Consumer<String> combained = c1.addThen(c2);
        combined.accept("sumaiya")
    }
}

//write a java progrma to all the elements in a list 
// to print log error messages 1. file not found 2.invalid password
// write a java program to print a message multiple  times
// write a java program to apply the discount of 5% to product 
// write a java program to append text to string builder
// write a java program to print all employee details
//write a java program to store key value pair into a map
// wreite a java program to compare to integer and print larger one;
// by using byconsumer ot print array index and value