class Solution {
    public void solve(int n,int open,int close,List<String> ans,StringBuilder curr){
        if(open==n && close==n){
            ans.add(curr.toString());
            return;
        }
        if(open<n){
            curr.append('(');
            solve(n,open+1,close,ans,curr);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(')');
            solve(n,open,close+1,ans,curr);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        // n=3 
        List<String> ans=new ArrayList<>();
      
        solve(n,0,0,ans,new StringBuilder());

        return ans;
        
    }
}