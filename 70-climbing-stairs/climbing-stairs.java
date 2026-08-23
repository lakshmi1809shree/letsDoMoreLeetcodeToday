class Solution {
    
    private int solve(int n,int[] dp){
        if(n==0|| n==1)return 1;
        if(dp[n]!=-1)return dp[n];
        int stepone=solve(n-1,dp);
        int steptwo=solve(n-2,dp);

        return dp[n]=stepone+steptwo;
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++)dp[i]=-1;
       return solve(n,dp);
    }
}