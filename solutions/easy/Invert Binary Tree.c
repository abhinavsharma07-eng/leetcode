// Title: Invert Binary Tree
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/invert-binary-tree/

    struct TreeNode* temp = root->left;
    root->left = root->right;
    root->right = temp;
    invertTree(root->left);
    invertTree(root->right);
    return root;
}
        return NULL;
    if (root == NULL)
