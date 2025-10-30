package module3.class_30_10_2025;

import java.util.PriorityQueue;

public class priorityqueuedemo {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
        //1.offers() - inserts the elements we can use add also
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(40);
        pq.offer(50);
        System.out.println(pq);
        //peak() - retrives head smallest without removing
        System.out.println("Head element (peak):" + pq.peek());
        //3.element() - similar to prak but throws exception if empty
        System.out.println("head element " + pq.element());
        //4.poll() removes and returns hed or null if empty
        System.out.println("removed head (poll)"+ pq.poll());
        for(Integer integer: pq){
            System.out.println(integer);
        }
    }
}
