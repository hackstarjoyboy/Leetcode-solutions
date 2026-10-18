/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       StringBuilder sb=new StringBuilder();
       buildString(root,sb);
       return sb.toString();   
    }
    private void buildString(TreeNode node,StringBuilder sb){
        if(node==null) return;
        sb.append(node.val).append(" ");
        buildString(node.left,sb);
        buildString(node.right,sb);

    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        String[] nodes=data.split(" ");
        int[] index=new int[]{0};
        return buildTree(nodes,index,Integer.MAX_VALUE);

    }
    private TreeNode buildTree(String[] nodes,int[] index,int upperBound){
        if(index[0]==nodes.length) return null;
        int val=Integer.parseInt(nodes[index[0]]);
        if(val>upperBound)return null;
        TreeNode root=new TreeNode(val);
        index[0]++;
        root.left=buildTree(nodes,index,root.val);
        root.right=buildTree(nodes,index,upperBound);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;