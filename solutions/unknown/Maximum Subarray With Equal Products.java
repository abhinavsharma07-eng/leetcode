// Title: Maximum Subarray With Equal Products
            // Difficulty: Unknown
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-subarray-with-equal-products/

class Solution {
    public int maxLength(int[] nums) {
        int best = 2, left = 0, prdt = 1;
        for (int right = 0; right < nums.length; right++) {
            int x = nums[right];
            while (gcd(prdt, x) > 1)
                prdt /= nums[left++];
            prdt *= x;
            best = Math.max(best, right - left + 1);
