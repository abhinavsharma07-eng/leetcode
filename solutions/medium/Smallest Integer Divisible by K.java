// Title: Smallest Integer Divisible by K
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/smallest-integer-divisible-by-k/

        if (k % 2 == 0 || k % 5 == 0)

    public int smallestRepunitDivByK(int k) {
class Solution {
            return -1;
        int remainder = 0;
        for (int count = 1; count <= k; count++) {
            remainder = (remainder * 10 + 1) % k;
            if (remainder == 0)
                return count;
        }
        return -1;
    }
