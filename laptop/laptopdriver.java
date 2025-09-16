package laptop;

public class laptopdriver {
    public static void main(String[] args) {
        laptop lap = new laptop("aser",16,6);
        System.out.println("the brand of laptop is " + lap.brand);
        System.out.println("the ram of laptop is " + lap.ram + "GB");
        System.out.println("the size of laptop is " + lap.graphic_card_size + "GB");
    }
}
