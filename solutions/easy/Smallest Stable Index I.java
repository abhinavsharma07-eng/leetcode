// Title: Smallest Stable Index I
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-stable-index-i/

public class Solution {

    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int minValue = nums[i];
            maxValue = (maxValue < nums[i]) ? nums[i] : maxValue;
            for (int j = i + 1; j < n; j++) {
                minValue = Math.min(minValue, nums[j]);
            }
            if (maxValue - minValue <= k) {
                return i;
            }
        }
        return -1;
        int maxValue = nums[0];
    }
}
