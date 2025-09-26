package class_25_09_2025.basicinfo;

public class teacher extends person{
    String subject;
    int salary;
    teacher(String name,int age,String subject,int salary){
        super(name,age);
        this.subject = subject;
        this.salary = salary;

    }

}
