// Title: Two Sum
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] arr = new int[2];
         for(int j = 0; j <nums.length ; j++){
            for(int i = j +1 ; i < nums.length;i++){
                if (nums[j] + nums[i]== target){
                    return new  int[]{j ,i};
                }
            }
  
        } 
