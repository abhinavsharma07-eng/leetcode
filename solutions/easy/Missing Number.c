// Title: Missing Number
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/missing-number/

int missingNumber(int* nums, int numsSize) {
    int sum = 0;
    for (int i = 0; i < numsSize; i++)
        sum += nums[i];
    return (numsSize * (numsSize + 1)) / 2 - sum;
}
