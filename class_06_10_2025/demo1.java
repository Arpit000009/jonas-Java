package class_06_10_2025;

public class demo1 {
    public static void main(String[] args) {
        String s = null;
        try{
            System.out.println(s.length());
        }
        catch(Exception e){
            System.out.println("s is null");
        }
        s = "Arpit";
        System.out.println(s);
    }
}
