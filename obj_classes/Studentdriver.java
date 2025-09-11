package obj_classes;

public class Studentdriver {
    public static void main(String[] args) {
        student s = new student();
        s.name = "Arpit";
        s.id = 9;
        s.age = 22;

        System.out.println(s.name);
        System.out.println(s.id);
        System.out.println(s.age);
    }
}
