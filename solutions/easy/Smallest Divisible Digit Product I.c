// Title: Smallest Divisible Digit Product I
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/smallest-divisible-digit-product-i/

int smallestNumber(int n, int t) {
    int num =n;
    int mul = 1;
    while(num !=0){
        mul *=num%10;
        num /=10;
    }

    if(mul%t==0) return n;
    else return smallestNumber(n+1,t);
    
