// Title: Power of Three
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/power-of-three/

bool isPowerOfThree(int n) {
    
    if(n%3!=0 && n>1) return false;
    while(n>3){
        n/=3;
        if(n%3!=0) return false;
    }
    if(n!=1 && n<3) return false;
    return true;
}
