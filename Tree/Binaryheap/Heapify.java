package Tree.Binaryheap;

//heapify operation is mainly use as subroutine in extract min or delete the node and buid heap
// and fix the violation
// time->O(logn)
//O(h) extra space
public class Heapify {
    int arr[];
    int size, capacity;

    void minHeapify(int i){
        //to make min heap by taking index of violating node
        int lt=left(i),rt=right(i)//by 21+iand 2i+2
        int smallest=i;
        if(lt<size&&arr[lt]<arr[i]){
            smallest=lt;
        }
        if(rt<size&&arr[rt]<arr[smallest]){
            smallest=rt;
        }
        if(smallest!=i){
            swap(arr[i],arr[smallest]);
            minHeapify(smallest);
        }
    }

    int Extractmin() {
        // we delete only from last node so we first smap root and last node
        if (size == 0)
            return Integer.MAX_VALUE;
        if (size == 1) {
            size--;
            return arr[0];
        }
        swap(arr[0], arr[size - 1]);
        size--;
        minHeapify(0);
        return arr[size];
    }

    void decresekey(int i, int x) {
        arr[i] = x;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            swap(arr[i], arr[parent(i)]);
            i = parent(i);
        }
    }

    void delete(int i) {
        // we first decrease the key value to -infinite so it become min then
        // we use extract min
        // time O(logn)
        decresekey(i, Integer.MIN_VALUE);
        Extractmin();
    }

    void buidheapify() {
        // O(n)
        // (size/2)-1 index of last non leaf node
        for (int i = (size / 2) - 1; i >= 0; i--) {
            minHeapify(i);
        }
    }
}
