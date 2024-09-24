package array.Binarysea;

//9
//wood cuting man cut the tree in such a way that total tree cut must be nearby to given value no wood waste
//array contain height of each tree
//we consider height of longest tree and low at lowest part of longest tree and high at highest part of longest tree cut at point mid
// if total wood cut is greater than require value so low=mid
// if it less do high=mid
public class Woodcuttingproblem {
    public static void main(String[] args) {
        int a[] = { 20, 15, 10, 17 };
        Woodcuttingproblem s = new Woodcuttingproblem();
        System.out.println(s.cutting(a, 7));
    }

    public int findwoodcount(int a[], int m) {// m is amount of wood is cut and it must be equal to woodcount
        int wc = 0;// amount of wood cut from each tree
        for (int i = 0; i < a.length; i++) {
            if (a[i] > m) {
                wc = wc + (a[i] - m);
            }
        }
        return wc;
    }

    public int cutting(int a[], int k) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int start = 0;
        int end = max;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            int wc = findwoodcount(a, mid);
            if (wc == k || start == mid) {
                return mid;
            } else if (wc > k) {
                start = mid;
            } else {
                end = mid;
            }
        }
        return -1;
    }
}
