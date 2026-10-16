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
 
    public int pathSum(TreeNode root, int targetSum) {
     Map<Long,Integer> prefixMap=new HashMap<>();
     prefixMap.put(0L,1);
     return dfs(root,0L,targetSum,prefixMap);   
    }
    private int dfs(TreeNode node,long currentSum,int targetSum,Map<Long,Integer>prefixMap){
        if(node==null) return 0;
        currentSum += node.val;
        long sumToFind=currentSum-targetSum;
        int totalPath=prefixMap.getOrDefault(sumToFind,0);
        prefixMap.put(currentSum,prefixMap.getOrDefault(currentSum,0)+1);
        totalPath+=dfs(node.left,currentSum,targetSum,prefixMap);
        totalPath+=dfs(node.right,currentSum,targetSum,prefixMap);
        prefixMap.put(currentSum,prefixMap.get(currentSum)-1);
        return totalPath;
    }
}