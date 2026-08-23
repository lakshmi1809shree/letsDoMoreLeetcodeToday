class Solution {
    int[] dp;
    private int solve(String s,int i){
        if(i==s.length())return 1;

        if(s.charAt(i)=='0')return 0;
        if(dp[i]!=-1)return dp[i];
        int ways=solve(s,i+1);
        if(i+1<s.length()){
            int nums=Integer.parseInt(s.substring(i,i+2));
            if(nums>=10 && nums<=26) ways+=solve(s,i+2);
        }
        return dp[i]=ways;
    }
    public int numDecodings(String s) {
        dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return solve(s,0);
    }
}