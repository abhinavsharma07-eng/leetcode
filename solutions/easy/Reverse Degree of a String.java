// Title: Reverse Degree of a String
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/reverse-degree-of-a-string/

class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int uniCode = 123 - (int) s.charAt(i);
            int product = (i + 1) * uniCode;
            sum += product;
        }
        return sum;
    }
}
