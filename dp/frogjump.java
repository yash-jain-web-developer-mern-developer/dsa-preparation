package dp;

public class frogjump {
    public static void main(String[] args) {
        int h[] = new int[5];
        System.out.println(climb(20,h)); 
    }

    public static int climb(int n, int h[]) {
        if (n == 0)
            return 0;
        int first = climb(n - 1, h) + Math.abs(h[n] - h[n - 1]);
        int second = Integer.MAX_VALUE;
        if (n > 1) {
             second = climb(n - 2,h) + Math.abs(h[n] - h[n - 2]);
     }
    
     return Math.min(first, second);
    }
}
