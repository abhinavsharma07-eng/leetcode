// Title: Palindrome Number
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/palindrome-number/

bool isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) return false;
    long rev =0;
    long  copy = x;
    while(copy!=0){
        rev = rev*10+ (copy%10);
        copy /=10;
    }
    return rev == x;
}
