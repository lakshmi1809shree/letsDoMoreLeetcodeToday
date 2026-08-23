class Solution {
    int[] dp;
    private int solve(int[] coins, int amount) {

        if (amount == 0) {
            return 0;
        }
        if(dp[amount]!=-1)return dp[amount];

        int min = Integer.MAX_VALUE;
        
        for (int coin : coins) {

            if (coin <= amount) {
                int result = solve(coins, amount - coin);

                if (result != Integer.MAX_VALUE) {
                    min = Math.min(min, 1 + result);
                }
            }
        }

         return dp[amount]=min;
    }
    public int coinChange(int[] coins, int amount) {
        dp=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans = solve(coins, amount);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}