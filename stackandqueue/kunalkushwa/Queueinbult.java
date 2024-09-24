package stackandqueue.kunalkushwa;

import java.util.LinkedList;
import java.util.Queue;

public class Queueinbult {
    public static void main(String[] args) {
     Queue<Integer> queue=new LinkedList<>();
      queue.add(6);
      queue.add(5);

      queue.add(4);
      queue.add(3);
      queue.add(2);
      System.out.println(queue.peek());
      System.out.println(queue.remove());
    }
}
