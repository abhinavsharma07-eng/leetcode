// Title: Smallest Stable Index I
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/smallest-stable-index-i/

    int max =nums[0];
    for(int i = 0 ; i < numsSize ; i++){
        if(max<nums[i]) max =nums[i];
        int min = INT_MAX;
        for(int j =i ;j < numsSize;j++){
            if(nums[j]<min) min = nums[j];
        }
        if((max-min) <= k) return i;
    }   
    return -1;
}
