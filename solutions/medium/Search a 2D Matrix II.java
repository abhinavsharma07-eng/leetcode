// Title: Search a 2D Matrix II
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-a-2d-matrix-ii/

            if (v == target)
                return true;
            if (v > target)
                c--;
            else
                r++;
        }
        return false;
    }
            int v = matrix[r][c];
        while (r < matrix.length && c >= 0) {
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0, c = matrix[0].length - 1;
