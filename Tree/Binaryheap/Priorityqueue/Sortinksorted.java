package Tree.Binaryheap.Priorityqueue;

import java.util.PriorityQueue;

//when array is already somewhat sorted 
//k sorted means array k where each element is at most K away from its target position, devise an algorithm that sorts in O(N log K) time.
public class Sortinksorted {
    void sortk(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {// we add number of element that are already sorted
            pq.add(arr[i]);
        }
        int index = 0;
        for (int i = k + 1; i < n; i++) {
            arr[index++] = pq.poll();
            pq.add(arr[i]);
        }
        while (pq.isEmpty() == false) {
            arr[index++] = pq.poll();
        }
    }
}
