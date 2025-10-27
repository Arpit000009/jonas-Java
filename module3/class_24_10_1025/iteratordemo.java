package module3.class_24_10_1025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteratordemo {
    public static void main(String[] args) {
        ArrayList<String>fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("watermelon");

        System.out.println("list of fruits" + fruits);

        Iterator<String>itr = fruits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ListIterator<String>listIterator = fruits.listIterator();
        // System.out.println("\n forward direction");
        // while(listIterator.hasNext()){
        //     System.out.println(listIterator.next()+" "+listIterator.previousIndex());
        // }

        System.out.println("\n backward direction");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous() + " " + listIterator.nextIndex());
        }
    }
}
