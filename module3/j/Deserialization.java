package module3.j;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("E:\\java\\module3\\j\\arpit.txt");
            ObjectInputStream o = new ObjectInputStream(f);
            student s = (student)o.readObject();
            System.out.println(s.id);
            System.out.println(s.name);
        } catch(Throwable e){
            e.printStackTrace();
        }
    }
}
