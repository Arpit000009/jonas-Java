package module3.class_29_10_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class studentbd implements Comparable<studentbd> {
    private int id;
    private String name;
    private double marks;

    public studentbd(int id, String name, double marks) {
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
        return "studentbd [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

    @Override
    public int compareTo(studentbd other) {
        return this.name.compareTo(other.name);
    }
}

public class comparabledesc {
    public static void main(String[] args) {
        List<studentbd> student = new ArrayList<studentbd>();
        student.add(new studentbd(103, "three", 30));
        student.add(new studentbd(101, "one", 10));
        student.add(new studentbd(102, "two", 20));
        student.add(new studentbd(104, "four", 40));
        Collections.sort(student);
        for (studentbd s : student) {
            System.out.println(s);
        }

    }
}
