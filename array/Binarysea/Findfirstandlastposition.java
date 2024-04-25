package array.Binarysea;

//7
public class Findfirstandlastposition {
    public static void main(String[] args) {
        int[] a = { 3, 4, 4, 4, 4, 4, 4, 4, 6 };
        int res[] = new int[2];
        int k = 4;
        Findfirstandlastposition s = new Findfirstandlastposition();
        res = s.first(a, k);
        System.out.println(res[0] + "  " + res[1]);
    }

    public int[] first(int a[], int k) {
        int start = 0;
        int end = a.length - 1;
        int res[] = { -1, -1 };
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (a[mid] == k) {
                res[0] = mid;
                end = mid - 1;
            } else if (a[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        start = 0;
        end = a.length - 1;
        mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (a[mid] == k) {
                res[1] = mid;
                start = mid + 1;
            } else if (a[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

}
