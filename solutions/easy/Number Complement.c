// Title: Number Complement
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/number-complement/

int findComplement(int num) {
    int x =0;
    int n =num;
    while(n!=0){
        x++;
        n/=2;
    }
    return pow(2,x)-num-1;
}
