// Title: Transform Array by Parity
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/transform-array-by-parity/

    int count = 0;
int* transformArray(int* nums, int numsSize, int* returnSize) {
 */
 * Note: The returned array must be malloced, assume caller calls free().
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] % 2 == 0)
