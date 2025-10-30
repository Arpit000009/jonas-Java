package module3.class_29_10_2025;

import java.util.ArrayList;
import java.util.Collections;

public class arrayl {
    public static void main(String[] args) {
        ArrayList<Integer>obj = new ArrayList<>();
        obj.add(20);
        obj.add(10);
        obj.add(30);
        obj.add(50);
        obj.add(40);
        System.out.println(obj);
        Collections.sort(obj);
        System.out.println(obj);
    }
    
}
