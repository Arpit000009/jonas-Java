package module3.class_28_10_2025;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(20);
        t1.add(10);
        t1.add(30);
        t1.add(40);
        t1.add(50);

        System.out.println(t1);
        Iterator<Integer> itr = t1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        System.out.println(t1.descendingSet());
        //higher
        System.out.println(t1.higher(30));
        //lower
        System.out.println(t1.lower(30));
        //first
        System.out.println(t1.first());
        //last
        System.out.println(t1.last());
        //firstpool
        System.out.println(t1.pollFirst());
        //lastpool
        System.out.println(t1.pollLast());
        //subset
        System.out.println(t1.subSet(20, 40));
        //headset
        System.out.println(t1.headSet(30));
        //tailset
        System.out.println(t1.tailSet(30));
        //size
        //isempty
        //clear
        //contains
        //remove
        //removeAll
        System.out.println("TreeSet elements: " + t1); // automatically sorted

        // size()
        System.out.println("Size of TreeSet: " + t1.size());

        // isEmpty()
        System.out.println("Is TreeSet empty? " + t1.isEmpty());

        // contains()
        System.out.println("Does TreeSet contain 30? " + t1.contains(30));
        System.out.println("Does TreeSet contain 100? " + t1.contains(100));

        // remove()
        System.out.println("Removing element 20...");
        t1.remove(20);
        System.out.println("After removal: " + t1);

        // removeAll()
        TreeSet<Integer> t2 = new TreeSet<>();
        t2.add(30);
        t2.add(40);

        System.out.println("Elements to remove: " + t2);
        t1.removeAll(t2);
        System.out.println("After removeAll: " + t1);

        // clear()
        t1.clear();
        System.out.println("After clear(): " + t1);
        System.out.println("Is TreeSet empty now? " + t1.isEmpty());
    }
}
