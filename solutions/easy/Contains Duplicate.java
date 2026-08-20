// Title: Contains Duplicate
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
         for(int i =1 ;i<nums.length;i++){
            set.add(nums[i-1]);
         }
            if(set.contains(nums[i])) return true;
         return false;
