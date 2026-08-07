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
     Integer prevValue=null;
       int mindiff=Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
     inorderTraversal(root);
     return mindiff;

    }
    private void inorderTraversal(TreeNode node){
        if(node==null){
            return;
        }
        inorderTraversal(node.left);
        if(prevValue!=null){
            mindiff=Math.min(mindiff,node.val-prevValue);
        }
        prevValue=node.val;
        inorderTraversal(node.right);
    }
}