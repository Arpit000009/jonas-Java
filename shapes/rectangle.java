package shapes;

public class rectangle extends shapes{
    int length;
    int breadth;
    
    rectangle(String name,double area,int length,int breadth){
        super(name,area);
        this.area = length*breadth;
        this.length = length;
        this.breadth = breadth;
        
    }

}
