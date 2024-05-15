package stackandqueue;

public class Queuecustom {// O(n) to remove an item we use circular queue
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public Queuecustom() {
        this(DEFAULT_SIZE);
    }

    public Queuecustom(int size) {
        this.data = new int[size];

    }

    public boolean isfull() {
        return end == data.length;
    }

    public boolean isempty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isfull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];
        // shift all element to left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("END");
    }
}
