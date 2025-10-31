
package module3.class_31_10_1015;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class dictionarydemo {
    public static void main(String[] args) {
        Dictionary<String,Integer> dictionary = new Hashtable<>();
        dictionary.put("Alice",101);
        dictionary.put("bob",102);
        dictionary.put("charlie",103);

        System.out.println("ID based on name:" + dictionary.get("Alice"));
        System.out.println("total size:"+dictionary.size());
        System.out.println("check dixtionary si empty or not?"+dictionary.isEmpty());
        System.out.println("display all entries");
        Enumeration<String>data = dictionary.keys();
        while(data.hasMoreElements()){
            System.out.println(data.nextElement());
        }
    }
}




// dictionary
// this class in java is an abstract class that represents a collection of key
// value painrs
// where keys are unique and used to access the values
// it was part of the java scollections fromework and it was introduced in java
// 1.0
// but has been largely replaced by the map interface since java 1.2
// stores key-value pairs where keys are unique
// provides basic operations like insert, retrive, and remove pairs
// keys and values are stored as object
// limited functionality compared to map implementstions
// public abstract class dictionary<K,V>extends Object
//insertion order is not preserved
//keys can not be duplicate and value can be duplicate but not null
