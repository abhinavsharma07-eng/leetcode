// Title: Power of Four
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/power-of-four/

bool isPowerOfFour(int n) {
   return  n > 0 && !(n&(n-1)) && (n%3==1);
}
