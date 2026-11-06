// Title: Peak Index in a Mountain Array
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/

int peakIndexInMountainArray(int* arr, int arrSize) {
    int lo = 0;
    int hi = arrSize - 1;
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] < arr[mid + 1])
            lo = mid + 1;
        else
            hi = mid;
    }
    return lo;
}
