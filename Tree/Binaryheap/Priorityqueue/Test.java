package Tree.Binaryheap.Priorityqueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();// min heap dafault
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());// max heap
        pq.add(10);
        pq.add(20);
        pq.add(30);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
