// Title: Find Numbers with Even Number of Digits
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

int countDigits(int num);
int findNumbers(int* nums, int numsSize) {
    int count=0;
    for(int i =0 ; i < numsSize ; i++){
        if(countDigits(nums[i])%2==0) count ++;
    }
    return count;
}
int countDigits(int num){
    int digits=0;
    while(num!=0){
        digits++;
        num/=10;
    }
    return digits;
}


