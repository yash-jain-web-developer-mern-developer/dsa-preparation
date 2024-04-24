package array.Binarysea;

//if element found so mid and start point to same element and end point to before mid element
// because loop terminate at start>end
//if element not found so mid and start point to just greater element and end point point just smaller element
public class Binarysearch {
    public static void main(String[] args) {
        int a[] = { 2, 4, 1, 6, 7, 8 };
        Binarysearch s = new Binarysearch();
        System.out.println(s.binary(a, 6));
    }

    public int binary(int a[], int k) {
        int start = 0;
        int end = a.length - 1;
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
}
