package carz;

public class car {
    String brand;
    int model;
    int price;

    car(String brand, int model,int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    car(int model,int price){
            this.model = model;
            this.price = price;
    }
    car(String brand, int model){
        this.brand = brand;
    }
   
}
