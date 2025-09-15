package carz;

public class cardiver {
    public static void main(String[] args) {
        car c1 = new car("toyota",9);
        car c2 = new car("rolls royce",11,500000000);

        System.out.println(c1.brand);
        System.out.println(c2.price);
    }
}
