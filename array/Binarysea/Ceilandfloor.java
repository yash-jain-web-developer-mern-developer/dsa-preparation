package array.Binarysea;

//4 binarysearch terminate when start>end start pointer point to greater or equal value of finding 
//element and end point to smaller than the finding element
public class Ceilandfloor {
    public static void main(String[] args) {
        int a[] = { 19, 23, 56, 61, 72, 88, 92 };
        Ceilandfloor s = new Ceilandfloor();
        System.out.println(s.ceil(a, 68));
        System.out.println(s.floor(a, 68));
    }

    public int ceil(int a[], int k) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == k) {
                return a[mid];
            } else if (a[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (start < a.length) {// in case we find floor of element such that element is at last index so start
                               // point to
            // array out of bound
            return a[start];
        } else {
            return -1;
        }

    }

    public int floor(int a[], int k) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == k) {
                return a[mid];
            } else if (a[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (end >= 0) {
            return a[end];
        } else {
            return -1;
        }

    }
}
