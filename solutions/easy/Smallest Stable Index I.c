// Title: Smallest Stable Index I
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/smallest-stable-index-i/

        for (int j = i; j < numsSize; j++) {
            if (min > nums[j])
        }
                min = nums[j];
        int min = INT_MAX;
            max = nums[i];
        if ((max - min) <= k)
            return i;
        if (max < nums[i])
    }
    return -1;
    for (int i = 0; i < numsSize; i++) {
    int max = INT_MIN;
int firstStableIndex(int* nums, int numsSize, int k) {
