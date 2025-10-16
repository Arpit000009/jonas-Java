package module3.class_15_10_2025;

import initial.Student;

class studentDb{
    int studentId;
    String studentName;
    int studentAge;
    public studentDb(int studentId,String studentName,int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
    @Override
    public String toString() {
        return "studentDb [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
                + "]";
    }
    
    
}

public class mainstudent {
    public static void main(String[] args) {
        studentDb[] students = new studentDb[5];
        students[0] = new studentDb(10, "pinky", 25);
        students[1] = new studentDb(10, "pinky", 25);
        students[2] = new studentDb(10, "pinky", 25);
        students[3] = new studentDb(10, "pinky", 25);
        students[4] = new studentDb(10, "pinky", 25);

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].toString());
        }
    }
}
