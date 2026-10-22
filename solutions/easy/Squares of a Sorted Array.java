// Title: Squares of a Sorted Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
    }
        Arrays.sort(nums);
        return nums;
}
