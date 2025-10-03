package msoffice;

public class msofficeDriver {
    public static void main(String[] args) {
        
        msoffice m = new word(".pdf","new");
        System.out.println(m.ext);
        System.out.println(m.name);
    }
    
}
