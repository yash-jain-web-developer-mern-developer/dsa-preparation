package array.Normal.subarray;

//5,12,11,16->4
//if every even or odd o/p=1
//if i element is even so i-1 is odd or viceversa if not so count reinitialize 
public class Maxlengthoevenoddsubarray {
    public static void main(String[] args) {
        int a[] = { 8, 10, 13, 14, 6, 5 };
        Maxlengthoevenoddsubarray s = new Maxlengthoevenoddsubarray();
        System.out.println(s.length(a));
    }

    public int length(int a[]) {
        int count = 1;
        int maxcount = 1;
        for (int i = 1; i < a.length; i++) {
            if ((a[i] % 2 == 0 && a[i - 1] % 2 != 0) || (a[i] % 2 != 0 && a[i - 1] % 2 == 0)) {
                count++;
                maxcount = Math.max(maxcount, count);
            } else {
                count = 1;
            }
        }
        return maxcount;
    }
}
