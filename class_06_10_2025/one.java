package class_06_10_2025;

public class one {

   static void m1(){

        System.out.println(10/0);
       
        System.out.println("exception");
       
    }
    public static void main(String[] args) {
       try{
         m1();
       }
       catch(Exception e){
        System.out.println("i am arpit");
        System.out.println(e.getMessage());
        e.printStackTrace();       }
    }
}
