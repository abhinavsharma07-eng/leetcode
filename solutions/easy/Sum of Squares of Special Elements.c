// Title: Sum of Squares of Special Elements
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/sum-of-squares-of-special-elements/

    int sum = 0;
    for (int i = 0; i < numsSize; i++) {
        if (numsSize % (i + 1) == 0) {
            sum += nums[i] * nums[i];
        }
    }
    return sum;
}
int sumOfSquares(int* nums, int numsSize) {
