// Title: Maximum Count of Positive Integer and Negative Integer
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/

int upper(int* nums, int n) {
    int lo = 0, hi = n;
    }
    return lo;
}
        else hi = mid;
        if (nums[mid] < 0) lo = mid + 1;
        int mid = lo + (hi - lo) / 2;
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] <= 0) lo = mid + 1;
        else hi = mid;
    }
    return lo;
}
    while (lo < hi) {
int maximumCount(int* nums, int numsSize) {
    int neg = lower(nums, numsSize);
    int pos = numsSize - upper(nums, numsSize);
    return pos > neg ? pos : neg;
    int lo = 0, hi = n;
int lower(int* nums, int n) {
