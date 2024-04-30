package array.Normal.subarray.slidingwindow;

//simply consider we see only that k size window
//if we move window so remove previous and add new one
public class Maxsumofsubarrayofsizek {
    public static void main(String[] args) {
        int a[] = { 2, 9, 31, -4, 21, 7 };
        Maxsumofsubarrayofsizek s = new Maxsumofsubarrayofsizek();
        System.out.println(s.sumsliding(a, 3));
    }

    public int sumsliding(int a[], int k) {
        int windowsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            windowsum = windowsum + a[i];
        }
        for (int i = k; i < a.length; i++) {
            windowsum = windowsum - a[i - k] + a[i];
            maxsum = Math.max(maxsum, windowsum);
        }
        return maxsum;
    }
}
