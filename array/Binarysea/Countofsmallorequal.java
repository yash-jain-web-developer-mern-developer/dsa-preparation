package array.Binarysea;

//6three case duplicate,no duplicate,not exist
public class Countofsmallorequal {
    public static void main(String[] args) {
        int a[] = { 2, 6, 12, 18, 21, 26, 26, 26 };
        int key = 26;
        Countofsmallorequal s = new Countofsmallorequal();
        System.out.println(s.count(a, key));
    }

    public int count(int a[], int k) {
        int start = 0;
        int end = a.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (a[mid] == k) {
                while (mid + 1 < a.length && a[mid + 1] == k) {
                    mid++;
                }
                break;
            } else if (a[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (a[mid] > k) {
            return mid;
        } else {
            return mid + 1;
        }

    }
}
