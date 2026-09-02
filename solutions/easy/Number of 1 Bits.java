// Title: Number of 1 Bits
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/number-of-1-bits/

class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if(n%2==1) count++;
            n/=2;
        }
        return count;
    }
}
