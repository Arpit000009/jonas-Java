package bycycle;

public class bycycle {
    String brand;
    double price;
    String color;

    bycycle(String brand){
        this.brand = brand;
    }
    bycycle(String brand,double price){
        this(brand);
        this.price = price;
    }
    bycycle(String brand, double price,String color){
        this(brand,price);
        this.color = color;
    }
}
