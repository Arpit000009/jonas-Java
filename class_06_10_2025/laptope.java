package class_06_10_2025;

import java.util.Objects;

public class laptope {
    String brand;
    int price;
    String processor;
    String model;
    laptope(String brand,int price,String processor,String model){
        this.brand = brand;
        this.price = price;
        this.processor = processor;
        this.model = model;
    }
    @Override
    public String toString(){
        return brand+ " "+price+" "+processor+" "+model;
    }
    @Override
    public boolean equals(Object o){
        laptope m = (laptope)o;

        return this.brand == m.brand && this.price == m.price && this.processor==m.processor && this.model == m.model;
    }
    @Override
    public int hashCode(){
        return Objects.hash(brand,price,processor,model);
    }
}
