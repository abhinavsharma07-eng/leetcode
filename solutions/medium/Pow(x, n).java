// Title: Pow(x, n)
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/pow(x,-n)/

        if(n == Integer.MIN_VALUE && x >0)  n = Integer.MIN_VALUE +1;
        if(n<0){
            x = 1.0/x;
            n = -n;
        }
        double result = 1.0;
        double currentProduct = x;

      while (n > 0) {
            if (n % 2 == 1) {
                result *= currentProduct;
            }
            currentProduct *= currentProduct;
            n /= 2;
class Solution {
    public double myPow(double x, int n) {
