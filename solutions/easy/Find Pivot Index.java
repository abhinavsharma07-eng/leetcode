// Title: Find Pivot Index
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != 0)
                sum2 += nums[i - 1];
            sum1 -= nums[i];
            if (sum1 == sum2)
                return i;
        }
        return -1;
    }
