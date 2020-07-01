class Solution {
    public static int func(int n, int[] dp) {
        if(n == 0 || n == 1) return 1;
        if(dp[n] != 0) return dp[n];
        int count = 0;
        for(int p = 1; p <= n; p++) count += func(p - 1, dp) * func(n - p, dp);
        return dp[n] = count;
    }
    public int numTrees(int n) {   
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        return func(n, dp);
    }
}
