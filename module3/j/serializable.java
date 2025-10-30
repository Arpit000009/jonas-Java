package module3.j;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializable {
    public static void main(String[] args) {
        student s = new student(1,"Arpit");
        try{
            FileOutputStream f = new FileOutputStream("E:\\java\\module3\\j\\arpit.txt");
            try (ObjectOutputStream o = new ObjectOutputStream(f)) {
                o.writeObject(s);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
