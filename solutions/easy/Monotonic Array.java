// Title: Monotonic Array
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] nums) {
        for(int i =0 ;i< nums.length-1;i++){
            if( nums[0] <= nums[nums.length-1]){
            if(nums[i]> nums[i+1]) return false;
            }
            else {
                if(nums[i]< nums[i+1]) return false;
            }
        }
        return true;
    }
}
