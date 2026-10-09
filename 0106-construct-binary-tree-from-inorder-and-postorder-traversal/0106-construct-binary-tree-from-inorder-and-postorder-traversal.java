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
    private int  postorderIndex;
    private HashMap<Integer,Integer> InorderHashMap;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         postorderIndex=postorder.length-1;;
         InorderHashMap=new HashMap<>();
         for(int i=0;i<inorder.length;i++){
             InorderHashMap.put(inorder[i],i);
         }

         return createTree(postorder,0,inorder.length-1);

    }
    private TreeNode createTree(int[] postorder,int left,int right){
        if( left>right) return null;
        int rootValue=postorder[postorderIndex--];
        TreeNode root=new TreeNode(rootValue);
        int mid=InorderHashMap.get(rootValue);
        root.right=createTree(postorder,mid+1,right);
        root.left=createTree(postorder,left,mid-1);
        
        return root;
    }
}