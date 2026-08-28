// Title: Add Digits
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/add-digits/

int addDigit(int num);
int addDigits(int num) {
   int sum = addDigit(num);
   while (sum >9) {
    sum = addDigit(sum);
   }
   return sum;
}
int addDigit(int num){
    int sum =0;
    while(num!=0){
        sum +=num%10;
        num/=10;
    }
    return sum ;
}

