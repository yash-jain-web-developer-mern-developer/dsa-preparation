package dp;

public class Fibo {
    public static void main(String[] args) {
        int dp[] = new int[5];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        } 
        System.out.println(fibomemo(4,dp));
    }

    public static int fiborec(int n) {
        if (n <= 1)
            return n;
        else
            return fiborec(n - 1) + fiborec(n - 2);

    }

    public static int fibomemo(int n, int dp[]) {
        if (n <= 1)
            return n;
        if (dp[n] == -1) {
            return dp[n];
        }

        return dp[n] = fibomemo(n - 1,dp) + fibomemo(n - 2,dp);

    }

    public static void fibotab(int n, int dp[]) {
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[n - 1] + dp[n - 2];
        }
        System.out.println(dp[n]);

    }
    public static void fibospace(int n,int dp[]) {
        int prev2 = 0;
        int prev1 = 1;
       
        for (int i = 2; i < n; i++) {
            int curi = prev2 + prev1;
            prev2 = prev1;
            prev1 = curi;
        }
        System.out.println(prev1);

    }
}
