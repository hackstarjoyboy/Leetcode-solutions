/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode ,TreeNode> parentMap=new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> result=new ArrayList<>();
        if(root==null) return result;
        buildParentMap(root,null);
        Queue<TreeNode> queue=new LinkedList<>();
        Set<TreeNode> visited=new HashSet<>();
        queue.offer(target);
        visited.add(target);
        int currentDistance=0;
        while(!queue.isEmpty()){
            if(currentDistance==k){
                for(TreeNode node: queue){

                
                result.add(node.val);
                }
            return result;
        }
        int levelSize=queue.size();
        for(int i=0;i<levelSize;i++){
            TreeNode curr=queue.poll();
            if(curr.left!=null && !visited.contains(curr.left)){
                visited.add(curr.left);
                queue.offer(curr.left);
            }
            if(curr.right!=null && !visited.contains(curr.right)){
                visited.add(curr.right);
                queue.offer(curr.right);
            }
            TreeNode parent=parentMap.get(curr);
            if(parent!=null && !visited.contains(parent)){
                visited.add(parent);
                queue.offer(parent);
            }
        }
        currentDistance++;
        }
        return result;

    }
    private void buildParentMap(TreeNode node,TreeNode parent){
      if(node==null) return ;
      parentMap.put(node,parent);
      buildParentMap(node.left,node);
      buildParentMap(node.right,node);  
    }
}