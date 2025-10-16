package module3.class_15_10_2025;

public class unboxing {
    public static void main(String[] args) {
        Integer obj = Integer.valueOf(10);//wrapper object
        int num = obj.intValue();//manually unboing using 
        System.out.println("wrapper object:"+obj);
        System.out.println("primtive value" +num);

        Integer i1 = 10;
        int i2 = i1.intValue();//manually unboxing
        System.out.println("manually onboxed value:"+i2);

        Integer i3 = new Integer(30);
        int i4 = i3;
        System.out.println(i3);
        System.out.println(i4);

        String str = "100";
        int num1 = Integer.parseInt(str);
        System.out.println(num1+50);
        long num2 = Long.parseLong(str);
        System.out.println(num2);
        
    }
}
