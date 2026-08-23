class Solution {
    int[] dp;
    private int solve(int[] nums,int i,int end){
        if(i>end)return 0;
        if(dp[i]!=-1)return dp[i];
        int rob=nums[i]+solve(nums,i+2,end);
        int skip=solve(nums,i+1,end);
        
        return dp[i]=Math.max(rob,skip);
    
    }
    public int rob(int[] nums) {
        int n=nums.length;
        dp=new int[n+1];
        for(int i=0;i<=n;i++)dp[i]=-1;
        if(n==1)return nums[0];
        int case1=solve(nums,0,n-2);
        Arrays.fill(dp, -1);
        int case2=solve(nums,1,n-1);

        return Math.max(case1,case2);
    }
}