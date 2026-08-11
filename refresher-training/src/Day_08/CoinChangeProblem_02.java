package Day_08;

import java.util.Arrays;
import java.util.List;

public class CoinChangeProblem_02 {
    public static long getWays(int n, List<Long> c) {
        // Write your code here
        long[] dp = new long[n + 1];

        dp[0] = 1;
        for (int i = 0; i < c.size(); i++) {
            int coin = c.get(i).intValue();

            for (int j = coin; j <= n; j++) {
                dp[j] = dp[j] + dp[j - coin];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
            int n = 4;

            List<Long> coins = Arrays.asList(1L, 2L, 3L);

            long result = getWays(n, coins);

            System.out.println(result);
    }
}




