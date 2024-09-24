package dp;

public class Climbingstars {
    public static void main(String[] args) {
        int n = 20;
        climb(n);
    }

    public static int climb(int n) {
        if(n==0) return 1;

        int first = climb(n - 1);
        int second = climb(n - 2);
        return first + second;
    }
}
