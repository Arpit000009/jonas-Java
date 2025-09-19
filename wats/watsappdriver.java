package wats;


public class watsappdriver {
    public static void main(String[] args) {
        watsapp w = new watsapp("hello","hi",3);
        w.uploadprofile(new profile(true,1));
        System.out.println(w.message);
        System.out.println(w.p.color);
        w.uploadprofile(new profile(true, 1));
    }
}
