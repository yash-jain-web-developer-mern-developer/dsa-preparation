package array.Binarysea;

//5
//bitonic sequence of number which first increasing then strictly decreasing
//find bitonic point or maximum element
//apply binary search on ascending array and binary search on descending array
public class Searchinbitonicarray {
    public static void main(String[] args) {
        int a[] = { 5, 6, 7, 8, 9, 10, 3, 2, 1 };
        int b = 8;
        Searchinbitonicarray s = new Searchinbitonicarray();
        int point = s.findBitonicpoint(a);
        System.out.println(s.search(a, b, point));
    }

    public int search(int a[], int key, int bindex) {
        if (key == a[bindex]) {
            return bindex;
        }
        if (key > a[bindex]) {
            return -1;
        }
        int res1 = ascendingsearch(a, key, bindex - 1);
        if (res1 != -1) {
            return res1;
        }
        int res2 = descendingsearch(a, key, bindex + 1);
        if (res2 != -1) {
            return res2;
        }
        return -1;
    }

    public int findBitonicpoint(int[] a) {
        int start = 0, end = a.length - 1, mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a[mid] > a[mid + 1] && a[mid - 1] < a[mid]) {
                return mid;
            } else if (a[mid] > a[mid - 1] && a[mid] < a[mid + 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return -1;
    }

    public int ascendingsearch(int a[], int k, int range) {
        int start = 0;
        int end = range;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == k) {
                return mid + 1;
            } else if (a[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int descendingsearch(int a[], int k, int range) {
        int start = range;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == k) {
                return mid + 1;
            } else if (a[mid] > k) {

                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
