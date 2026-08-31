// Title: Harshad Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/harshad-number/

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum =0;
        int n =x;
        while(x!=0){
            sum +=x%10;
            x/=10;
        }
        if(n%sum ==0) return sum;
        return -1;   
    }
}
