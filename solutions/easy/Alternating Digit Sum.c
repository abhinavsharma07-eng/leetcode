// Title: Alternating Digit Sum
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/alternating-digit-sum/

        digits++;
        temp/=10;
    }
    for(int i =1 ; n!=0;i++){
        int d= n%10;
        if(i%2==0) sum -=d;
        else sum +=d;
        n /=10;
    }
        }
        if(digits%2==0){
        if(i%2==0) sum +=d;
        else sum -=d;
        }
        else {
    return sum; 
}
