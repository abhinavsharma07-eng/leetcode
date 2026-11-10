// Title: Flatten Binary Tree to Linked List
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

void flatten(struct TreeNode* root) {
 */
 * };
 *     struct TreeNode *right;
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
    for (struct TreeNode* cur = root; cur; cur = cur->right) {
        if (cur->left) {
            struct TreeNode* last = cur->left;
            while (last->right)
                last = last->right;
            last->right = cur->right;
            cur->right = cur->left;
            cur->left = NULL;
        }
    }
}
 * Definition for a binary tree node.
/**
