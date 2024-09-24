package dp;

public class Maxsumofnonadjacent {
    public static void main(String[] args) {
        int n=5;
        int h[]=new int[n];
        sumadj(n, h);
    }

    public static int sumadj(int n, int h[]) {
        if (n == 0)
            return h[0];
        if (n < 0) {
            return 0;
        }    
        int firstpick = h[n] + h[n - 2];
        int secondpick = 0 + h[n - 1];
        return Math.max(firstpick, secondpick);
    }
    
}

