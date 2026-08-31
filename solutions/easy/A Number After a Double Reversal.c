// Title: A Number After a Double Reversal
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/a-number-after-a-double-reversal/

    int rev =0;
    while(num!=0){
        rev = rev*10 + num%10;
        num /=10;
int reverse(int num){
}
bool isSameAfterReversals(int num) {
    return num == reverse(reverse(num));
int reverse(int num);
    }
    return rev;
} 
