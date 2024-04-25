package array.Binarysea;

//8
//if target is found at mid return mid
//if it lie on left sorted array then search in left sorted
//if it lie on right sorted array then search in right sorted
public class Searchinrotatedsortedarray {
    public static void main(String[] args) {
        int a[] = { 4, 5, 6, 7, 8, 1, 2 };
        Searchinrotatedsortedarray s = new Searchinrotatedsortedarray();
        System.out.println(s.search(a, 6));
    }

    public int search(int a[], int target) {
        int start = 0;
        int end = a.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a[mid] == target) {
                return mid;
            } else if (a[start] < a[mid]) {
                if (target >= a[start] && target < a[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > a[mid] && target <= a[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
