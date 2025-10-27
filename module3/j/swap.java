package module3.j;

public class swap {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        
        // a = a^b;
        // b = b^a;
        // a = a^b;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
