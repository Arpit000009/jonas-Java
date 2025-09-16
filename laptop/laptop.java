package laptop;

public class laptop {
    int ram;
    String brand;
    String processor;
    int graphic_card_size;

    laptop(String brand){
        this.brand = brand;
       
    }

    laptop(String brand,int ram){
            this(brand);
            this.ram = ram;
    }

    laptop(String brand, int ram,int graphic_card_size){
        this(brand,ram);
        this.graphic_card_size = graphic_card_size;
    }
}
