package module3.class_30_10_2025;

import java.util.Iterator;
import java.util.Stack;

public class stackdemo {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        //push elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        Iterator<Integer>itr = stack.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println("stack:" + stack);
        //peek()
        System.out.println(stack.peek());
        System.out.println("stack is empty?");
        while(!stack.isEmpty()){
            System.out.println("popped: "+stack.pop());
            System.out.println(stack);
        }
        System.out.println("is stack empty: " + stack.isEmpty());
    }
}
