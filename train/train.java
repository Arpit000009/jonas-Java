package train;

public class train {
    String enginettype;
    int speed;
    String name;
    int noofcoaches;
    train(String enginetype,int speed,String name,int noofcoaches){
        this.enginettype = enginetype;
        this.speed = speed;
        this.name = name;
        this.noofcoaches = noofcoaches;
    }
}

class vandeBharat extends train{
    vandeBharat(String enginetype,int speed,String name,int noofcoaches){
        super(enginetype,speed,name,noofcoaches);
    }
}

class vandeBharatDreiver{
    public static void main(String[] args) {
        vandeBharat v1 = new vandeBharat("electric", 150, "veer", 10);
    }
}