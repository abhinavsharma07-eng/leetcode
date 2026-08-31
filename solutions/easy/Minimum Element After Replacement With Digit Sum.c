// Title: Minimum Element After Replacement With Digit Sum
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/

int addDigits(int num);
int minElement(int* nums, int numsSize) {
    int min = INT_MAX;
    for(int i =0 ; i< numsSize ; i++){
        nums[i] = addDigits(nums[i]);
        if(nums[i]< min) min = nums[i];
    }
    return min;
}
int addDigits(int num ){
    int sum =0 ;
    while(num!=0){
        sum +=num%10;
        num/=10;    
    }
    return sum;
}
