// Title: Search a 2D Matrix
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-a-2d-matrix/

            int i = mid / col;
            int mid = lo + (hi - lo) / 2;
            int j = mid % col;
            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return false;
        while (lo <= hi) {
        int hi = row * col - 1;
        int row = matrix.length, col = matrix[0].length;
        int lo = 0;
    public boolean searchMatrix(int[][] matrix, int target) {
class Solution {
