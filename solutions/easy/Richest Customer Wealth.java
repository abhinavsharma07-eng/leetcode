// Title: Richest Customer Wealth
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int n[] : accounts) {
            int sum = 0;
            for (int m : n) {
                sum += m;
            }
            if (sum > wealth)
                wealth = sum;
        }
        return wealth;
    }
}
