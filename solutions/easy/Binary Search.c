// Title: Binary Search
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/binary-search/

int search(int* nums, int numsSize, int target) {
    int low = 0;
    int high = numsSize - 1;
    while (low <= high) {
        int mid = (high - low) / 2 + low;
        if (nums[mid] == target)
            return mid;
        else if (nums[mid] > target)
            high = mid - 1;
        else
            low = mid + 1;
    }
    return -1;
}
