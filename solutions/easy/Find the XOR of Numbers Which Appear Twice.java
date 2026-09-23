// Title: Find the XOR of Numbers Which Appear Twice
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-xor-of-numbers-which-appear-twice/

class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (set.contains(n))
                res ^= n;
        int res = 0;
            set.add(n);
        }
        return res;
    }
