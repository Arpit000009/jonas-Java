package module3.class_17_10_2025.one;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListdemo {
    public static void main(String[] args) {
        ArrayList<String>fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("mango");
        fruits.add("Orange");

        //Printinng of Arralist
        System.out.println("list of fruits" + fruits);

        //2. add(int index,E element)
        fruits.add(1,"grapes");
                System.out.println(fruits);


        //get(int index)
        System.out.println(fruits.get(2));
        System.out.println(fruits);

        //4.set(int index,E elemtnt)
        fruits.set(0, "blueberry");
        System.out.println(fruits);

        //5.remove(Object o)
        fruits.remove("Banana");
        System.out.println(fruits);

        //6.remove(int index)
        fruits.remove(0);
        System.out.println(fruits);

        //7.contains(Object o)
        System.out.println(fruits.contains("grapes"));
        System.out.println(fruits);

        //8.size();
        System.out.println(fruits.size());

        //isempty();
        System.out.println(fruits.isEmpty());

        //10 indexOf(Object o)
        System.out.println(fruits.indexOf("Mongo"));

        //11 lastIndexOf(index o);
        System.out.println(fruits.lastIndexOf("grapes"));

        //12.toArray()
        Object[] friutArray = fruits.toArray();
        System.out.println("fruitArray: ");
        for(int i=0;i<friutArray.length;i++){
            System.out.println(friutArray[i]);
            
        }

        //13.clear()   list_name.clear();

        //14.addAll(collection<!extends>c)

        //15.removeAll(coloection)

        //16.retailAll         last_list.retailAll(new_list)

        for(String st:fruits){
            System.out.print(st + " ");
        }
        System.out.println();

        fruits.forEach(ref-> System.out.print(ref+" "));
    }
}
