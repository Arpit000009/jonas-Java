package class_06_10_2025;

public class lapetope {
    public static void main(String[] args) {
        laptope l = new laptope("acer",90000,"octa  core","nitro5");
        laptope l2 = new laptope("acer",90000,"octa  core","nitro5");
        System.out.println(l);
        System.out.println(l.equals(l2));
        System.out.println(l.hashCode());
        System.out.println(l2.hashCode());
    }
}
