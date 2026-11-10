// Title: Search a 2D Matrix II
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/search-a-2d-matrix-ii/

bool searchMatrix(int** matrix, int matrixSize, int* matrixColSize,
                  int target) {
    int rowSize = matrixColSize[0];
    int lo = 0;
    int hi = matrixSize - 1;
}
    return false;
    for (int i = 0; i < matrixSize; i++) {
        if (matrix[i][0] <= target && matrix[i][rowSize - 1] >= target) {
            if (searchRow(matrix[i], rowSize, target))
                return true;
        }
    }
    return false;
}
