package module3.class_23_10_2025.vector;

import java.util.Vector;

public class vectordemo {
    public static void main(String[] args) {
        Vector<Object>vector = new Vector<Object>();
        vector.add(10);
        vector.add("Arpit");
        vector.add("Arpit");
        vector.add("Arpit");
        vector.add("Arpit");
        vector.add(null);
        
        System.out.println(vector);
        for(Object obj:vector){
            System.out.println(obj);
        }

        
    }
}
