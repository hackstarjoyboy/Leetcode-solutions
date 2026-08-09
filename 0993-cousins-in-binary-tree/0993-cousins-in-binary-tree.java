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
    public boolean isCousins(TreeNode root, int x, int y) {
    if(root==null) return false;
    Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
        int size=queue.size();
        boolean xfound=false;
        boolean yfound=false;
        for(int i=0;i<size;i++)
        {
            TreeNode current = queue.poll();
            if(current.left!=null && current.right!=null)
            {  if((current.left.val==x && current.right.val==y)
                      ||(current.left.val==y && current.right.val==x))
                      {
                        return false;
                       }
            }
            if(current.val==x) xfound = true;
            if(current.val==y) yfound = true;

            if(current.left!=null){queue.offer(current.left);}
            if(current.right!=null){queue.offer(current.right);}
            
        }
            if(xfound && yfound){return true;}
            if(xfound||yfound){return false;}
        
    }
    return false;
      }
}