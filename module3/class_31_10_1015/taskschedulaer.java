package module3.class_31_10_1015;

import java.util.Comparator;
import java.util.PriorityQueue;

//develeop a aaplication program where client have assigned some tasks 
//task 1 in a project fix the bugs
//taks 2 in a project test the feature
//task 3 in a project write a report
//now as a user define which collection type you will use and implement this program
class task{
    String name;
    int priority;

    public task(String name,int priority){
        
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "task [name=" + name + ", priority=" + priority + "]";
    }

    
}

class TaskPriority implements Comparator<task>{
    public int compare(task o1,task o2){
        return o1.priority-o2.priority;
    }
}
public class taskschedulaer {
   public static void main(String[] args) {
       PriorityQueue<task> taskqueue = new PriorityQueue<task>(new TaskPriority());
       taskqueue.add(new task("write report", 3));
       taskqueue.add(new task("test features", 2));
       taskqueue.add(new task("test feature", 1));
       while(!taskqueue.isEmpty()){
        System.out.println(taskqueue.poll());
       }
   }

}

//dictionary
//this class in java is an abstract class that represents a collection of key value painrs
//where keys are unique and used to access the values
//it was part of the java scollections fromework and it was introduced in java 1.0
//but has been largely replaced by the map interface since java 1.2
//stores key-value pairs where keys are unique
//provides basic operations like insert, retrive, and remove pairs
//keys and values are stored as object
//limited functionality compared to map implementstions
//public abstract class dictionary<K,V>extends Object