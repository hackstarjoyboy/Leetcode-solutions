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
    Map<Integer,Integer> postMap=new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n=postorder.length;
        for(int i=0;i<n;i++){
            postMap.put(postorder[i],i);
        }
        return build(preorder,0,n-1,0,n-1);
    }
    private TreeNode build(int[] preorder ,int preStart,int preEnd,int postStart,int postEnd){
        if(preStart>preEnd){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preStart]);
        if(preStart==preEnd){
            return root;
        }
        int leftVal=preorder[preStart+1];
        int leftpostIndex=postMap.get(leftVal);
        int leftSize=leftpostIndex-postStart+1;
        root.left=build(preorder,preStart+1,preStart+leftSize,postStart,leftpostIndex);
        root.right=build(preorder,preStart+leftSize+1,preEnd,leftpostIndex+1,postEnd-1);
        return root;
    }
}