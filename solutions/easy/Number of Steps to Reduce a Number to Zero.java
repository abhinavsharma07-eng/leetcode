// Title: Number of Steps to Reduce a Number to Zero
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            num = (num % 2 == 0) ? num / 2 : num - 1;
            count++;
        }
        return count;
    }
}
