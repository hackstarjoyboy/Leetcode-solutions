/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void inorder(struct TreeNode* node, int k, int* count, int* result) {
    if (node == NULL || *count >= k) {
        return;
    }
    inorder(node->left, k, count, result);
    (*count)++;
    if (*count == k) {
        *result = node->val;
        return;
    }
    inorder(node->right, k, count, result);
}
int kthSmallest(struct TreeNode* root, int k) {
    int count = 0;
    int result = -1;
    inorder(root, k, &count, &result);
    return result;
}