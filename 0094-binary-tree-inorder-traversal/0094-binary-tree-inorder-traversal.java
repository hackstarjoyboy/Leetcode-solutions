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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        TraversalInorder(root,result);
        return result;
    }
    private List<Integer> TraversalInorder(TreeNode node,List<Integer> result){
        if(node==null) return result;
     
     TraversalInorder(node.left,result);
 result.add(node.val);
     TraversalInorder(node.right,result);
    


 
 return result;


    }
}