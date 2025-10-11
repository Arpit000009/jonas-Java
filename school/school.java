package school;

public class school {
    public void m1(double time){
        if(time<8){
            throw new earlyEnrtyException();
        }
        else if(time>9){
            throw new lateEnrtyException();
        }
        System.out.println("you can enter");
    }
}
