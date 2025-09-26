package product;

public class product {
    String name;
    String color;
    product(String name,String color){
       this.name = name;
       this.color = color;
    }
}

class Shirt extends product{
    int size;
    Shirt(String name , String color,int size){
        super(name,color);
        this.size = size;
    }

}

class productDriver{
    public static void main(String[] args) {
        product p = new Shirt("one", "pink",3);
        Shirt s = (Shirt)p;
        System.out.println(s.name);
    }
}
