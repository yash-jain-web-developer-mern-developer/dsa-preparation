package stackandqueue.kunalkushwa;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeueinbuilt {
    public static void main(String[] args) {
    Deque<Integer> deque=new ArrayDeque<>();
    deque.add(3);
    deque.addFirst(4);
    deque.removeFirst();
    }
}
