/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     struct Node *left;
 *     struct Node *right;
 *     struct Node *next;
 * };
 */

struct Node* connect(struct Node* root) {
	struct Node* curr=root;

    while(curr!=NULL){
        struct Node dummy;
        dummy.next=NULL;
        struct Node* tail=&dummy;
        while(curr!=NULL){
            if(curr->left!=NULL){
                tail->next=curr->left;
                tail=tail->next;
            }
            if(curr->right!=NULL){
                tail->next=curr->right;
                tail=tail->next;
            }
            curr=curr->next;
        }
        curr=dummy.next;
    }
    return root;
}