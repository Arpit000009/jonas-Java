package mobilee;

public class mobile {
    double screensize;
    String brand;
    Earphone e;
    mobile(double screensize,String brand){
        this.screensize = screensize;
        this.brand = brand;
    }
    public void insert(Earphone e){
        if(this.e == null){
            this.e = e;
            System.out.println("earphone inserted");
        }
        else{
            System.out.println("earphone already present");
        }
    }
    public void remove(){
        if(this.e!=null){
            this.e = null;
            System.out.println("earphones removed");
        }
        else{
            System.out.println("no eraphones to be removed");
        }
    }
}
