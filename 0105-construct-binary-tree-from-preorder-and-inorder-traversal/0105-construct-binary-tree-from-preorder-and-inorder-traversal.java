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
    private int preorderIndex;
    private Map<Integer,Integer> inorderIndexMap;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex=0;
        inorderIndexMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inorderIndexMap.put(inorder[i],i);
        }
        return splitTree(preorder,0,inorder.length-1);
    }
    private TreeNode splitTree(int[] preorder,int left,int right){
        if(left>right) return null;
        int rootValue=preorder[preorderIndex++];
        TreeNode root= new TreeNode(rootValue);
        int mid=inorderIndexMap.get(rootValue);
        root.left=splitTree(preorder,left,mid-1);
        root.right=splitTree(preorder,mid+1,right);
        return root;
    }
}