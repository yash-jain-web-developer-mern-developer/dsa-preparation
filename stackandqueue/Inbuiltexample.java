package stackandqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class inbuiltexample {

    // public static void main(String[] args) {
    // Stack<Integer> s = new Stack<>();
    // s.push(34);
    // s.push(45);
    // s.push(2);
    // s.push(9);
    // s.push(18);
    // System.out.println(s.pop());
    // System.out.println(s.pop());
    // System.out.println(s.pop());
    // System.out.println(s.pop());
    // System.out.println(s.pop());
    // // System.out.println(s.pop());
    // }

    // public static void main(String[] args) {
    // Queue<Integer> q = new LinkedList<>();
    // //it is an interface
    // q.add(3);
    // q.add(6);
    // q.add(4);
    // q.add(5);
    // q.add(7);
    // System.out.println(q.peek());
    // System.out.println(q.remove());
    // }

    // public static void main(String[] args) {
    // Deque<Integer> q = new ArrayDeque<>();
    // // it is faster than queue
    // // is resizable array
    // q.add(89);
    // q.addLast(78);
    // q.addFirst(2);
    // q.remove();
    // q.removeFirst();
    // q.removeLast();

    // }
    public static void main(String[] args) throws Exception {
        Stackcustom s = new Stackcustom(5);
        s.push(34);
        s.push(45);
        s.push(2);
        s.push(9);
        s.push(18);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}