// Title: Power of Two
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n&(n-1)) == 0&& n>0;
    }
}
