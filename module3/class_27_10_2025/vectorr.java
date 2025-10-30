package module3.class_27_10_2025;
import java.util.Vector;

public class vectorr {
    public static void main(String[] args) {
        
        Vector<Integer> vec = new Vector<>();
       

        // int n = sc.nextInt();

        // while(n>0){
        //     vec.add(sc.nextInt());
        //     n--;
        // }
        
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(40);
        vec.add(50);
        vec.add(1,1);
        System.out.println("\nsize of vector: "+vec.size());
        System.out.println("capacity of vector: "+vec.capacity());
        vec.removeElement(40);

        for (int i = 0; i < vec.size(); i++) {
            System.out.print(vec.get(i) + " ");
        }
    }
}
