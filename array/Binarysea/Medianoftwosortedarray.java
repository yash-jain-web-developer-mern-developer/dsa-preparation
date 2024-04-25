package array.Binarysea;

// 10  O(m+n)
// if odd->element[n/2];
// if even->(element[n/2]+element[(n/2)-1])/2
//first we merge both array in sorted form
public class Medianoftwosortedarray {
    public static void main(String[] args) {
        int a1[] = { 1, 3, 8, 7 };
        int a2[] = { 5, 6, 7, 19, 21, 25 };
        Medianoftwosortedarray s = new Medianoftwosortedarray();
        float arr = s.merge(a1, a2);
        System.out.println(arr);
    }

    public float merge(int a1[], int a2[]) {
        int n = a1.length;
        int m = a2.length;
        int i = 0, j = 0, k = 0;
        int b[] = new int[n + m];
        while (i < n && j < m) {
            if (a1[i] <= a2[j]) {
                b[k] = a1[i];
                i++;
                k++;
            } else {
                b[k] = a2[j];
                k++;
                j++;
            }
        }

        while (i < n) {
            b[k] = a1[i];
            k++;
            i++;
        }

        while (j < m) {
            b[k] = a2[j];
            k++;
            j++;
        }
        if (b.length % 2 == 0) {
            int mid = (b.length) / 2;
            return (float) (b[mid] + b[mid - 1]) / 2;
        } else {
            int mid = (b.length) / 2;
            return b[mid];
        }
        // we can optimize that b fill upto when k <=b.length/2
        // so O(m+n)/2 but still it is linear
    }
}
