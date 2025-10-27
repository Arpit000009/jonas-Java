package module3.class_24_10_1025;

import java.util.ArrayList;
import java.util.ListIterator;

public class students {
    public static void main(String[] args) {
        ArrayList<String> stud = new ArrayList<>();
        stud.add("Arpit");
        stud.add("baburao");
        stud.add("ganpatrao");
        stud.add("aapte");
        stud.add("Raju");

        System.out.println("list" + stud);

        ListIterator<String> itr = stud.listIterator();
        while(itr.hasNext()){
            int index =itr.nextIndex();
            String name=itr.next();
            System.out.println("index "+ index + "->"+name);
           
            

            //modify elements during  iteration
            if(name.equals("aapte")){
                itr.set("new Apte");
            }

            //add new elements after babaurao
            if(name.equals("baburao")){
                itr.add("shayam");
            }
        }
        System.out.println("\n backward iteration");

        while(itr.hasPrevious()){
            // int index=itr.previousIndex();
            // String name=itr.previous();

            System.out.println(itr.previousIndex()+" "+ itr.previous());
        }
        System.out.println(stud);
    }
}
