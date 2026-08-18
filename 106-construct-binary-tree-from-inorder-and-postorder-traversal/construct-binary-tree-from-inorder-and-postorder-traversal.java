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
    int index;
    private TreeNode helper(int[] postorder,int start,int end,HashMap<Integer,Integer> mp){
        
        if(start>end) return null;
        int rootVal=postorder[index--];
        TreeNode node=new TreeNode(rootVal);
        int inorderIndex=mp.get(rootVal);
        
        node.right=helper(postorder,inorderIndex+1,end,mp);
        node.left=helper(postorder,start,inorderIndex-1,mp);
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        index=postorder.length-1;
         HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(postorder,0,inorder.length-1,map);
    }
}