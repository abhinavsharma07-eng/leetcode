// Title: Majority Element
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        
         int x = nums[0];
        int count =0;
        for(int n : nums ){
            if(count ==0 ) x = n;
            if(x == n) count++;
            else count--;
            
        }
        return x;

    }
}
