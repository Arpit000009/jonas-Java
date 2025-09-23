package songss;

public class song {
    String name;
    double duration;
    String genre;
    String singer;

    song(String name,double duration,String genre,String singer) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.singer = singer;
    }
}

class PhirMohobbat extends song {
    String mname;
    String composer;
    PhirMohobbat(String name,double duration,String genre,String singer,String mname,String composer) {
        super(name, duration, name, singer);
        this.mname = mname;
        this.composer = composer;
    }
}

class vandeBharatDreiver {
    public static void main(String[] args) {
        PhirMohobbat karnne_chale_hai_tu = new PhirMohobbat("mohobbat",3.0,"romantic","Arjit Singh","murder 3","muthun");
        System.out.println("thie singer of this song is "+karnne_chale_hai_tu.singer);
    }
}