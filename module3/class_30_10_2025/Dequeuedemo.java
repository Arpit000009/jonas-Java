package module3.class_30_10_2025;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeuedemo {
    public static void main(String[] args) {
        Deque<String>dq = new ArrayDeque<String>();
        dq.addFirst("java");
        dq.addLast("Python");
        dq.offerFirst("C++");
        dq.offerLast("JavaScript");
        System.out.println("dequeue after "+ dq);
        System.out.println("first element: "+dq.peek());
        System.out.println("last element: "+dq.peekLast());

        dq.removeFirst();
        dq.removeLast();
        
        System.out.println(dq.size());
        System.out.println(dq.isEmpty());
        
        System.out.println("dequeue after removal"+ dq);
    }
}
