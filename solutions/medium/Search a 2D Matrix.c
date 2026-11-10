// Title: Search a 2D Matrix
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/search-a-2d-matrix/

    int n = matrixColSize[0];
    int lo = 0, hi = matrixSize * n - 1;
    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        int v = matrix[mid / n][mid % n];
        if (v == target)
            return true;
        if (v < target)
            lo = mid + 1;
        else
            hi = mid - 1;
    }
    return false;
}
