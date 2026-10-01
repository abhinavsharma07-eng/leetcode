// Title: Search Insert Position
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/search-insert-position/

    while (start <= end) {
        mid = (start + end) / 2;

        if (nums[mid] == target)
            return mid;
        else {
            if (target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
    }
    return end + 1;
}
    int mid = (start + end) / 2;
    int start = 0;
    int end = numsSize - 1;
int searchInsert(int* nums, int numsSize, int target) {
