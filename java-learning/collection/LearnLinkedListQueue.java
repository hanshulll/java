
// HERE WE ARE IMPLEMENTING QUEUE USING LINKED LIST

package collection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>(); /* we can write LinkedList<> here because it's implementing queue interface.
                                                    and linked list have all the methods that queue give because it's implementing queue*/
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);               // The offer() method of the Queue is used to insert the specified element into this queue.
        queue.offer(50);

        System.out.println(queue);
        System.out.println(queue.peek()); /* The peek() method of Queue class retrieves the head of this queue i.e the element which
                                          is the first in the line to get out of the queue but doesn't remove it. */
        queue.poll();                     /* The poll() method of Queue class retrieves the head of this queue,
                                          and also removes it. The method returns null if this queue is empty.*/
        System.out.println(queue);
    }
}

/*
NOTE : Here all the methods i.e (.offer),(.poll) etc are coming from queue.
 */