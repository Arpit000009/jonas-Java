package module3.class_15_10_2025;

public class autoboxing {
    public static void main(String[] args) {
        int num = 10; //primtive int
        Integer obj = num; //autoboxing: int -> Integer
        System.out.println(Integer.valueOf(num)); // manual conversion
        System.out.println("Primtive:" + num);
        System.out.println("wrapper object:" + obj);
    }
}
