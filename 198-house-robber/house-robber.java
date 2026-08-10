class Solution {
    public int solve(int[] nums,int i,int n,int[] dp){
        if(i>n){
            return 0;
        }
        if(dp[i]!=-1)return dp[i];
        return dp[i]=Math.max(solve(nums,i+1,n,dp),nums[i]+solve(nums,i+2,n,dp));
    }
    public int rob(int[] nums) {
        if(nums.length==0)return 0;
        int n=nums.length-1;
        int[] dp=new int[n+2];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return Math.max(solve(nums,0,n,dp),solve(nums,1,n,dp));
    }
}