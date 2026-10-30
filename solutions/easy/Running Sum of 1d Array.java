// Title: Running Sum of 1d Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] arr = nums;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
