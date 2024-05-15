package stackandqueue;

public class Dynamicqueue extends Circularqueue {
    public Dynamicqueue() {
        super();
    }

    public Dynamicqueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if (isfull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(item);
    }
}
