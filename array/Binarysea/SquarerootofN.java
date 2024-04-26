package array.Binarysea;

//if square root is not whole number so return floor
//O(logn)
public class SquarerootofN {
    public static void main(String[] args) {
        int a = 25;
        SquarerootofN s = new SquarerootofN();
        System.out.println(s.sqrt(a));
    }

    public int sqrt(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int l = 2, h = n / 2;
        int res = 0;
        while (l <= h) {
            int m = (l + h) / 2;
            if (m * m == n) {
                return m;
            } else if (m * m < n) {
                l = m + 1;
                res = l;// satisfy floor
            } else {
                h = m - 1;
            }
        }
        return res;
    }
}
