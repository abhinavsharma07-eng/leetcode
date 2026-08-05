// Title: Remove Element
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-element/

        while (i<j){
            if(val == nums[j]) j--;
            else if (val== nums[i]){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;  
                i++;           
            }
            else i++;
        }
        for(int n : nums){
          
        int k=0;
            if(val == n) break;
              k++;
        }
        return k;
        
    }
}
    public int removeElement(int[] nums, int val) {
        int i =0 ;
        int j = nums.length-1;
class Solution {
