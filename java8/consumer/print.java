package java8.consumer;

import java.util.function.Consumer;

//write a java program to print the number
public class print {
 public static void main(String[] args) {
    Consumer<Integer> printnum = N-> System.out.println("number:"+N);
    printnum.accept(10);
 }   
}

//write a java program to convert string to upper case and print
//
