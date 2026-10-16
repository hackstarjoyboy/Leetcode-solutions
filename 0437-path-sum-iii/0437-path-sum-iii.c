/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 int pathsStartingFromNode(struct TreeNode* node,long currentTarget){
    if(node==NULL) return 0;
    int paths=0;
    if(node->val==currentTarget){
        paths++;
    }
    paths+=pathsStartingFromNode(node->left,currentTarget-node->val);
    paths+=pathsStartingFromNode(node->right,currentTarget-node->val);
    return paths;
}

 
int pathSum(struct TreeNode* root, int targetSum) {
   if(root==NULL) return 0;
   int pathsFromRoot=pathsStartingFromNode(root,(long)targetSum);
   int pathsFromleft=pathSum(root->left,targetSum);
   int pathsFromRight=pathSum(root->right,targetSum);
   return pathsFromRoot+pathsFromleft+pathsFromRight;
}