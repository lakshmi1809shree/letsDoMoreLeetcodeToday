class Solution {
    int[] dp;
    public int solve(int[] cost,int i){
        if(i>=cost.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int onestep=cost[i]+solve(cost,i+1);
        int twostep=cost[i]+solve(cost,i+2);

        return dp[i]=Math.min(onestep,twostep);


    }
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        for(int i=0;i<cost.length;i++)dp[i]=-1;
        int n=cost.length;
        return Math.min(solve(cost,0),solve(cost,1));
    }
}