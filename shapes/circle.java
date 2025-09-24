package shapes;

public class circle extends shapes{
    int radius;
    circle(String name,double area,int radius){
       super(name,area);
        this.area = Math.PI * radius * radius;
        this.radius = radius;
    }
    // void diplay(){
    //     area = Math.PI * radius * radius;
    //     System.out.println(area);
    // }
}
