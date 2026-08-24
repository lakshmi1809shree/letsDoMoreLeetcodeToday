class Solution {
    int[][] dp;
    public boolean solve(int[] nums,int i,int target) {
        if(target==0)return true;
        if(i>=nums.length || target<0)return false;

        if(dp[i][target]!=-1)return dp[i][target]==1;

        boolean take=solve(nums,i+1,target-nums[i]);
        boolean skip=solve(nums,i+1,target);

        boolean ans=take||skip;
        dp[i][target]=ans?1:0;

        return ans;
    }
    public boolean canPartition(int[] nums){
        int sum=0;
        for(int num:nums)sum+=num;

        if(sum%2!=0)return false;
        int target=sum/2;

        dp=new int[nums.length][target+1];

        for(int[] row:dp)Arrays.fill(row,-1);

        return solve(nums,0,target);
    }
}