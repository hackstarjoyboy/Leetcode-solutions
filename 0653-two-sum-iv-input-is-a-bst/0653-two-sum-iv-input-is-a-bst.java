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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set=new HashSet<>();
        return dfs(root,set,k);
    }
    private boolean dfs(TreeNode node,Set<Integer> sets,int k){
        if(node==null) return false;
        int complement=k-node.val;
        if(sets.contains(complement)){
            return true;
        }
        sets.add(node.val);
        
        return dfs(node.left,sets,k)||dfs(node.right,sets,k);
    }
}