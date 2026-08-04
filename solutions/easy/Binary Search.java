// Title: Binary Search
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
      int end = nums.length-1;
      int start = 0;
        for (int i =0 ; i < nums.length;i++){
            int mid = (start + end)/2;
            if(nums[mid] == target) return mid;
            else{
                if(target > nums[mid]) start = mid+1;
                else end = mid -1; 
            }
        }
