package module3.class_29_10_2025;

import java.util.Comparator;
import java.util.TreeSet;


    class employeeDB {
        private int id;
        private String name;
        private double salary;

        public employeeDB(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "emplayeeDB [id=" + id + ", name=" + name + ", salary=" + salary + "]";
        }

    }


class sortId implements Comparator<employeeDB> {
    @Override
    public int compare(employeeDB o1, employeeDB o2) {

        if (o1.getId() < o2.getId()) {
            return -1;
        } else if (o1.getId() > o2.getId()) {
            return 1;
        } else {
            return 0;
        }
    }

}

public class comparatortreeset {
    public static void main(String[] args) {
        sortId sortid = new sortId();
        TreeSet<employeeDB> employee1 = new TreeSet<employeeDB>(sortid);
        employee1.add(new employeeDB(103,"alice",50000));
        employee1.add(new employeeDB(102,"bob",40000));
        employee1.add(new employeeDB(101,"tom",30000));
        employee1.add(new employeeDB(109,"jerry",70000));
        
        for(employeeDB e :employee1){
            System.out.println(e);
        }
    }
}
