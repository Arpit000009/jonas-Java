class demothread implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("");
        }
    }
}

public class Mythreaddriver {
    public static void main(String[] args) {
        mythread m =new mythread();
        m.start();
    }
}


