// Title: Search in Rotated Sorted Array
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

            if (nums[lo] <= target && nums[mid] > target)
                hi = mid - 1;
            else
                lo = mid + 1;
        } else {
            if (nums[mid] < target && nums[hi] >= target)
                lo = mid + 1;
        else if (nums[lo] <= nums[mid]) {
            return mid;
        if (nums[mid] == target)
        int mid = lo + (hi - lo) / 2;
    while (lo <= hi) {
    int lo = 0, hi = numsSize - 1;
int search(int* nums, int numsSize, int target) {
