// Title: GCD of Odd and Even Sums
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/gcd-of-odd-and-even-sums/

class Solution {
    public int gcdOfOddEvenSums(int n) {
       int  sumOdd =0;
       int sumEven =0;
       int i =0;
       for( i =1 ; i<= n; i++){
        sumOdd +=2*i-1;
        sumEven += 2*i;
       }
        i = (sumOdd >sumEven)?sumEven:sumOdd;
       while( i!=1){
        if(sumOdd%i ==0 && sumEven%i==0) return i;
