// Title: Find the Sum of Encrypted Integers
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/find-the-sum-of-encrypted-integers/

    for(int i =0; i < numsSize ;i++){
        sum +=encrypt(nums[i]);
    }   
    return sum;
}
    int sum =0;
int encrypt(int x);
int sumOfEncryptedInt(int* nums, int numsSize) {
int encrypt(int x){
