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
    int currentCount=0;
    int maxCount=0;
    List<Integer> modes=new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inorderTraversal(root);
        int[] result=new int[modes.size()];
        for(int i=0;i<modes.size();i++){
            result[i]=modes.get(i);
        }
        return result;
        
    }
 private void inorderTraversal(TreeNode node)
 {
        if(node==null) return ;
    
    inorderTraversal(node.left);
    if(prevValue!=null && node.val==prevValue){
        currentCount++;
    }else{
        currentCount=1;
    }
    prevValue=node.val;
    if(currentCount==maxCount){
        modes.add(node.val);
    }else if(currentCount>maxCount){
        maxCount=currentCount;
        modes.clear();
        modes.add(node.val);
    }
    inorderTraversal(node.right);
  }
}