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
    public int findBottomLeftValue(TreeNode root) {
        int[] arr=new int[2];
      if(root!=null){  arr[0]=0;
        arr[1]=root.val;
      }
        levelWiseleftValue(root,arr,0);
        return arr[1];
        
    }
    private void levelWiseleftValue(TreeNode node,int[] arr,int level){
        if(node==null) return;

        if( arr[0]<level){
            arr[0]=level;
            arr[1]=node.val;
        }
        levelWiseleftValue(node.left,arr,level+1);
        levelWiseleftValue(node.right,arr,level+1);

    }
}