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
        int xdepth=-1;
        int ydepth=-2;
        TreeNode xparent=null;
        TreeNode yparent=null;
    public boolean isCousins(TreeNode root, int x, int y) {
       dfs(root,null,0,x,y);
       return (xdepth==ydepth)&& (xparent!=yparent);

    }
    private void dfs(TreeNode node,TreeNode parent,int depth ,int x,int y){
        if(node==null) return ;
        if(node.val==x){
            xdepth=depth;
            xparent=parent;
        }else if(node.val==y){
            ydepth=depth;
            yparent=parent;
        }
        dfs(node.left,node,depth+1,x,y);
        dfs(node.right,node,depth+1,x,y);
    }
}