package module3.j;

import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) throws IOException{
        //either can be used throws for io exception or try catch
        File f = new File("E:\\java\\module3\\j\\ragner.java");
        if(f.createNewFile()){
            System.out.println("file created");
        }
        else{
            System.out.println("Name:"+f.getName());
            System.out.println("location:"+f.getAbsolutePath());
            System.out.println("readable:"+f.canRead());
            System.out.println("writable:"+f.canWrite());
            System.out.println("size:"+f.length());
        }
    }
}
