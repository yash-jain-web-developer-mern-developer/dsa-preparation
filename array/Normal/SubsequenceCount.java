package array.Normal;

import java.util.Scanner;

public class SubsequenceCount {
    static final int MOD = 1000000007;

    public static int countSubsequences(String str, String sub) {
        int n = str.length();
        int m = sub.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str.charAt(i - 1) == sub.charAt(j - 1)) {
                    dp[i][j] = (dp[i - 1][j] + dp[i - 1][j - 1]) % MOD;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sub = scanner.nextLine();

        int result = countSubsequences(str, sub);
        System.out.println(result);

        scanner.close();
    }
}
