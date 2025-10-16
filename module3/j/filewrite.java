package module3.j;

import java.io.FileWriter;

public class filewrite {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("E:\\java\\module3\\j\\aparna.txt");
            f.write("java programming");
        } catch (Exception e) {
            // TODO: handle exception
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
