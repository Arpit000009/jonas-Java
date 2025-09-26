package class_25_09_2025.managerr;

public class manager extends employee {
    int deptno;
    manager(String name,int age,int id,int deptno){
        super(name, age, id);
        this.name = name;
        this.age = age;
        this.id = id;
        this.deptno = deptno;
    }
}
