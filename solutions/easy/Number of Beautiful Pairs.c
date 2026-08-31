// Title: Number of Beautiful Pairs
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/number-of-beautiful-pairs/

        for(int i = 0 ; i < numsSize-1 ; i++){
            for(int j = i+1 ; j < numsSize ; j++){
               int first = nums[i];
                while (first >= 10) first /= 10; 
                int last = nums[j] % 10;         
                if (gcd(first, last)) count++;
            }
        }
        return count;
    }
     bool gcd(int num1 , int num2){
       int small = (num1<num2)?num1:num2;
       while(small!=1){
        if(num1%small ==0 && num2%small==0) return false;
        small--;
       }
       return true;
    }
