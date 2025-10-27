package module3.class_27_10_2025;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashsetdemo {
    public static void main(String[] args) {
        Set<Object>set = new HashSet<Object>();
        set.add("Abc");
        set.add(null);
        set.add(10);
        set.add("Abc");
        Iterator<Object>itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
