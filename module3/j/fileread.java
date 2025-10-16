package module3.j;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileread {
    public static void main(String[] args) {
        FileReader f = null;
        try{
            f = new FileReader("E:\\java\\module3\\j\\aparna.txt");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        int i;
        try{
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try {
                f.close();
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            
        }
    }
}
