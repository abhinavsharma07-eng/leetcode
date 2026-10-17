// Title: Type of Triangle
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/type-of-triangle/

        int sum = nums[0] + nums[1] + nums[2];
        for (int n : nums) {
            if ((sum - n) <= n)
                return "none";
        }
        if (xor == nums[0] && xor == nums[1])
            return "equilateral";
        int xor = 0;
            xor ^= n;
    public String triangleType(int[] nums) {
class Solution {
        if (nums[1] != nums[2] && nums[0] != nums[1] && nums[0] != nums[2])
            return "scalene";
        return "isosceles";
    }
}
