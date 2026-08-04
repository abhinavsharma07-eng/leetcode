// Title: Search Insert Position
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int end = nums.length-1;
      int start = 0;
      int mid = (start + end)/2;
        while(start <= end ){
            mid = (start + end)/2;
            
            if(nums[mid] == target) return mid;
            else{
                if(target > nums[mid]) start = mid+1;
                else end = mid -1; 
