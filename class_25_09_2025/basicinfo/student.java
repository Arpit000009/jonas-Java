package class_25_09_2025.basicinfo;

public class student extends person {
    char grade;
    int rollno;
    student(String name,int age,char grade,int rollno){
        super(name,age);
        this.grade = grade;
        this.rollno = rollno;
    }
}
