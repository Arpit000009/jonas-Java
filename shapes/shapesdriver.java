package shapes;

public class shapesdriver {
    public static void main(String[] args) {
        circle c = new circle("cir",0,4);
        System.out.println(c.radius);
        System.out.println(c.name);
        System.out.println(c.area);
        // rectangle rec = new rectangle("rectangle",0,5 ,4);
        // System.out.println("the name of shape is "+rec.name);
        // System.out.println("the length of rectangle is "+rec.length);
        // System.out.println("the breadth of rectangle is "+rec.breadth);
        // System.out.println("the area of rectangle is "+rec.area);
    }
}
