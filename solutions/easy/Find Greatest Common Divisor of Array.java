// Title: Find Greatest Common Divisor of Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-greatest-common-divisor-of-array/

class Solution {
    public int findGCD(int[] nums) {
        int greatest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0 ; i <nums.length;i++){
            if(greatest< nums[i]) greatest = nums[i];
            if(smallest > nums[i]) smallest = nums[i];
        }
        int j = smallest;
        while(j!=1){
        if(smallest%j==0 && greatest%j==0) return j;
        j--;
