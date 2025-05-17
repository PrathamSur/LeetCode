class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) return 1;
        
        int[] dp = new int[n + 1];
        dp[0] = 1; // 1 way to stay at ground (do nothing)
        dp[1] = 1; // 1 way to climb 1 step
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}
