/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<TreeNode>[] dp;
    private List<TreeNode> solve(int n){
        if(n%2==0){
            return new ArrayList<>();
        }

        if(dp[n]!=null){
            return dp[n];
        }
        List<TreeNode> result=new ArrayList<>();
        if(n==1){
            result.add(new TreeNode(0));
            return dp[n]=result;
        }
        for(int left=1;left<n;left+=2){
            int right =n-1-left;

            List<TreeNode> leftTrees=solve(left);
            List<TreeNode> rightTrees=solve(right);

            for(TreeNode l:leftTrees){
                for(TreeNode r:rightTrees){
                    TreeNode root=new TreeNode(0);
                    root.left=l;
                    root.right=r;
                    result.add(root);
                }
            }
        }
        return dp[n]=result;

    }
    public List<TreeNode> allPossibleFBT(int n) {
        dp=new List[n+1];
        return solve(n);
    }
}