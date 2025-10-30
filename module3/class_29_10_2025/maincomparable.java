package module3.class_29_10_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//step1: create student class that implements comparable
class studentdb implements Comparable<studentdb>{
    int id;
    String name;
    private double marks;
    
    
    public studentdb(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public double getMarks() {
        return marks;
    }


    @Override
    public String toString() {
        return "studentdb [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

    @Override
    public int compareTo(studentdb other){
        //internally it takes merge sort technique from java 9 onwards it internally use tim sort(merge sort + insertion sort)
        if(this.id>other.id){
            return 1; //this comes before other
        }else if(this.id<other.id){
            return -1; //this comes ofter other
        }
        else{
            return 0; //both are equal
        }

    }
    
}
    


public class maincomparable {
    public static void main(String[] args) {
        List<studentdb> student = new ArrayList<studentdb>();
        student.add(new studentdb(103, "three", 30));
        student.add(new studentdb(101, "one", 10));
        student.add(new studentdb(102, "two", 20));
        student.add(new studentdb(104, "four", 40));

        Collections.sort(student);
        System.out.println(student);
    }

}
