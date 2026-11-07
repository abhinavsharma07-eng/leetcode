// Title: Binary Tree Inorder Traversal
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/binary-tree-inorder-traversal/

 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
        list.addAll(inorderTraversal(root.left));
    }
}
