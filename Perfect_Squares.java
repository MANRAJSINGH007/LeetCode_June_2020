class Solution{
    public int fun(int n, int[] dp) {
        double x = Math.sqrt(n);
        if(x == Math.floor(x)) return 1;
        if(dp[n] != 0) return dp[n];
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= (int)Math.sqrt(n); i++) {
            int p = fun(n - (int)Math.pow(i, 2), dp);
            if(p != Integer.MAX_VALUE) p++;
            min = Math.min(p, min);
        }
        return dp[n] = min;
    }
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        return fun(n, dp);
    }
}
