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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return false;
        int valued=root.val;
       boolean ans= dfs(root,valued);
       return ans;
    }
    private boolean dfs(TreeNode node,int value){
        if(node==null) return true;
       if(node.val!=value){
        return false;
       }
       return dfs(node.left,value)&dfs(node.right,value);
    }  
}