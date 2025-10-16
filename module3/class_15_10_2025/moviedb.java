package module3.class_15_10_2025;
import java.util.Scanner;

public class moviedb {
    String movietype;
    String moviename;
    int lengthOfMovie;

    public moviedb(String movietype,String moviename,int lengthOfMovie) {
        this.moviename = moviename;
        this.lengthOfMovie = lengthOfMovie;
        
    }

    @Override
    public String toString() {
        return "moviedb [movietype=" + movietype + ", moviename=" + moviename + ", movielenght=" + lengthOfMovie
                + "]";
    }
}

class mainMovie{

    public static String longestmovie(moviedb[] movie){
        int length = 0;
        int j = 0;
        for(int i=0;i<movie.length;i++){
            if(movie[i].lengthOfMovie>length){
                length = movie[i].lengthOfMovie;
                j = i;
            }
        }
        return movie[j].moviename;
    }
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("enter the no of movies:");
    int n = s.nextInt();
    moviedb[] movie = new moviedb[n];
    for(int i=0;i<movie.length;i++){
        System.out.println("enter "+ (i+1) +"th movie name");
        String one = s.next();
        s.nextLine();
        System.out.println("enter "+ (i+1) +"th movie type");
        String two = s.next();
        System.out.println("enter "+ (i+1) +"th movie length");
        int three = s.nextInt();
        s.nextLine();
        movie[i] = new moviedb(one, two, three);
    }
    for (int i = 0; i < movie.length; i++) {
        System.out.println(movie[i].toString());
    }
    System.out.println("the longest movie is " + longestmovie(movie));
 s.close();   
}

}

