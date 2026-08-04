// Title: Palindrome Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        int m=x;
        int rev=0,r;  
        if (x < 0) return  false;
        else {
            while (m!=0){
                r= m%10;
                rev = rev*10 + r;
                m = m/10;
                
            }
