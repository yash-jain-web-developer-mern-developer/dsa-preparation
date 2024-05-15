package stackandqueue;

public class Circularqueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public Circularqueue() {
        this(DEFAULT_SIZE);
    }

    public Circularqueue(int size) {
        this.data = new int[size];

    }

    public boolean isfull() {
        return size == data.length;
    }

    public boolean isempty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isfull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isempty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isempty()) {

            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.println(data[i]);
            i++;
            i %= data.length;
        } while (i != end);
        System.out.println("END");
    }
}
