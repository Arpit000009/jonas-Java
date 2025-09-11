package initial;

public class studentd {
   public static void main(String[] args) {
    Student s = new Student();
    System.out.println(s.name);
    System.out.println(s.id);
    System.out.println(s.age);

    s.age=22;
    s.name = "Arpit";
    s.id = 9;

    System.out.println(s.name);
   }
}
