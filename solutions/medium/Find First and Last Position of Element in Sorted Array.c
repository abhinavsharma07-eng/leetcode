// Title: Find First and Last Position of Element in Sorted Array
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

        if (nums[mid] <= x) lo = mid + 1;
        else hi = mid;
        int mid = lo + (hi - lo) / 2;
    while (lo < hi) {
    }
    return lo;
}
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int lo = 0, hi = n;
}
int upper(int* nums, int n, int x) {
        else hi = mid;
    }
    return lo;
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] < x) lo = mid + 1;
 */
int lower(int* nums, int n, int x) {
    int lo = 0, hi = n;
 * Note: The returned array must be malloced, assume caller calls free().
    int *arr = malloc(2*sizeof(int));
    int n = numsSize;
