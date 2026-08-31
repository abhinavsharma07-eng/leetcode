// Title: Find if Digit Game Can Be Won
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/find-if-digit-game-can-be-won/

    int sumOfOneDigitNumber =0;
    for(int i =0 ; i < numsSize; i++){
        if(nums[i]> 9 )sumOfTwoDigitNumber +=nums[i];
        else  sumOfOneDigitNumber +=nums[i];
    }
    return !(sumOfOneDigitNumber == sumOfTwoDigitNumber);
}
