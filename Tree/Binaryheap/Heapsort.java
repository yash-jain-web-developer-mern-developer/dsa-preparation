package Tree.Binaryheap;

// the basic idea is based on selection sort
//we rearrange to make max heap  to sort in increasing order
//O(nlogn) time
public class Heapsort {
    void heapsort(int arr[], int n) {
        buildheap(arr, n);
        for (int i = n - 1; i >= 1; i--) {
            swap(arr[0].arr[i]);// we swap max element with last element and secondmax with second last element
            heapify(arr, i, 0); // after swap we not do any acton on max element on last postion and rest of
                                // tree we make max heap
        }

    }

    void buildheap(int arr, int n) {
        for (int i = (n / 2) - 1; i >= 0; i--) {
            maxheapify(arr, n, i);
        }
    }

    void maxheapify(int arr[], int n, int i) {
        // to make maxheap by taking index of violating node
        int largest = i, left = 2 * i + 1, right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr[largest], arr[i]);
            maxheapify(arr, n, largest);
        }
    }
}
