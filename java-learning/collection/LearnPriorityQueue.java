package collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedMap;

public class LearnPriorityQueue {
    public static void main(String [] args){
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(54);
        pq.offer(73);
        pq.offer(34);
        pq.offer(5);               // The offer() method of the Queue is used to insert the specified element into this queue.
        pq.offer(63);
        System.out.println(pq);      // In priority queue elements are automatically arranged according to their priorities
        pq.poll();                   /* The poll() method of Queue class retrieves the head of this queue,
                                        and also removes it. The method returns null if this queue is empty.*/
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
