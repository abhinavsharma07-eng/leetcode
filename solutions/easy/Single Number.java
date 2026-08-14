// Title: Single Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {

        int result=0;
        for(int n: nums){
             int result =0;
             result = result^n;
        }
        return result;
}
