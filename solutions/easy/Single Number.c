// Title: Single Number
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/single-number/

        result ^=nums[i];
    }
    
    return result;
}
    for(int i =0 ; i< numsSize; i++){
int singleNumber(int* nums, int numsSize) {
    int result =0;
