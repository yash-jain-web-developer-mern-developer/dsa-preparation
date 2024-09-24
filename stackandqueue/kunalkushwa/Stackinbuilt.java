package stackandqueue.kunalkushwa;

import java.util.Stack;

public class Stackinbuilt {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
