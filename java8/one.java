//write the java program to print names that starts with a 

package java8;

import java.util.function.Predicate;

public class one {
    public static void main(String[] args) {
        String[] str = {"Arpit","Lucky","Gotam","Ahmed"};
        Predicate<String> startwith_a = n->n.startsWith("A");
        for(String s:str){
            if(startwith_a.test(s)){
                System.out.println(s);
            }
        }
    }
}
