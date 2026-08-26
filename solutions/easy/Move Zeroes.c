// Title: Move Zeroes
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/move-zeroes/

     int nonZero=0;
void moveZeroes(int* nums, int numsSize) {
     int i =0;
     for(i =0 ;i< numsSize;i++){
        if(nums[i]!=0){
            nums[nonZero]= nums[i];
            nonZero++;
        }
     }
        for(i = nonZero;i<numsSize;i++)
            nums[i]=0;
     }

    

