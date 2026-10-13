// Title: Maximum Alternating Sum of Squares
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-alternating-sum-of-squares/

        Arrays.sort(nums);
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length / 2)
                sum = sum - nums[i] * nums[i];
            else
                sum = sum + nums[i] * nums[i];
        }
            if (nums[i] < 0)
                nums[i] = -nums[i];
        }
    public long maxAlternatingSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
class Solution {
