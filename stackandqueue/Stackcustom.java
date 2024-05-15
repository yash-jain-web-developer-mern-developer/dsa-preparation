package stackandqueue;

public class Stackcustom {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public Stackcustom() {
        this(DEFAULT_SIZE);
    }

    public Stackcustom(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isfull()) {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isempty()) {
            throw new Exception("Cannot pop from an empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peak() throws Exception {
        if (isempty()) {
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isfull() {
        return ptr == data.length - 1;
    }

    public boolean isempty() {
        return ptr == -1;
    }

    public static void main(String[] args) {

    }
}
