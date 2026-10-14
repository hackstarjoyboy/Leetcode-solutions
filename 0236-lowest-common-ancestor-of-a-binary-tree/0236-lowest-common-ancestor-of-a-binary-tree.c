/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* lowestCommonAncestor(struct TreeNode* root, struct TreeNode* p, struct TreeNode* q) {
    if(root==NULL)return NULL;
    if(root==p || root==q){
        return root;
    }
    // if(p->left==q ||p->right==q)return p;
    // if(q->left==p || q->right) return q;
    struct TreeNode* leftResult=lowestCommonAncestor(root->left,p,q);
    struct TreeNode* rightResult=lowestCommonAncestor(root->right,p,q);
    if(leftResult!=NULL && rightResult!=NULL){
        return root;
    }
    return leftResult!=NULL ?leftResult:rightResult;
}