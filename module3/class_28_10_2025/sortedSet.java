package module3.class_28_10_2025;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedSet {
    public static void main(String[] args) {
        SortedSet<Integer>number = new TreeSet<>();
        number.add(50);
        number.add(10);
        number.add(30);
        number.add(20);
        number.add(40);
        System.out.println(number);
        //returns the lowest element
        System.out.println(number.first());
        //returns the largest element
        System.out.println(number.last());
        //subSet(fromelement,toElement)
        System.out.println(number.subSet(20, 50));
        //headSet(toElement) returns elements less than or equal to toElement
        System.out.println(number.headSet(30));
        //return element less than or equal to fromElement
        System.out.println(number.tailSet(30));
    }
}
