// Title: Count Integers With Even Digit Sum
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/count-integers-with-even-digit-sum/

        num--;
    }
    return count;
}
int addDigits(int num ){
    int sum =0;
    while(num !=0){
        sum +=num%10;
        num/=10;
    if (num< 10) return num;
    }
    return sum;
}
            count ++;
