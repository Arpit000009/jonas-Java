package module3.class_23_10_2025;

public class book {
    private String name;
    private int id;
    private String author;
    private int price;

    book(int id,String name,String author,int price){
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

   public int getId(){
        return id;
    }

    public String getTitle(){
        return name;
    }

    @Override
    public String toString() {
        return "book [name=" + name + ", id=" + id + ", author=" + author + ", price=" + price + ", toString="
                 + "]";
    }
}
