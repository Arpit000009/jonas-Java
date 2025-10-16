package module3.j;

import java.io.File;

public class renamefile {
    public static void main(String[] args) {
        File f1 = new File("E:\\\\java\\\\module3\\\\j\\\\ragner.java");
        File f2 = new File("E:\\\\java\\\\module3\\\\j\\\\legratha.java");
        if(f1.exists()){
            f1.renameTo(f2);
            System.out.println("renamed sucessfully");
        }
        else{
            System.out.println("file do not exists");
        }
    }
}
