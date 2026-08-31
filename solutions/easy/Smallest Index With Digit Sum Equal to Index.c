// Title: Smallest Index With Digit Sum Equal to Index
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/

int addDigits(int num);
int smallestIndex(int* nums, int numsSize) {
    
}
int addDigits(int num){
    for(int i =0 ; i< numsSize ; i++){
        if(addDigits(nums[i])==i) return i;
    }
    return -1;
