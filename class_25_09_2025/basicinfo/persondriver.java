package class_25_09_2025.basicinfo;

public class persondriver {
    public static void main(String[] args) {
        student ramesh = new student("ramesh", 23, 'A', 46);
        System.out.println(ramesh.name);
        System.out.println(ramesh.age);
        System.out.println(ramesh.grade);
        ramesh.rollno = 56;
        System.out.println(ramesh.rollno);
    }
}
