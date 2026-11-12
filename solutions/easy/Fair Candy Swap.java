// Title: Fair Candy Swap
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/fair-candy-swap/

        for (int b: bobSizes) sum2 += b;
        HashSet<Integer> set = new HashSet<>();
        for(int b : bobSizes) set.add(b);
        int sumDiff = (sum1 - sum2) / 2;
        for (int a :aliceSizes) {
            int val = a - sumDiff;
            if(set.contains(val)){
                arr[0]= a;
                arr[1]=val;
                break;
            }
        for (int a: aliceSizes) sum1 += a;
        int sum1 = 0, sum2 = 0;
        int[] arr = new int[2];
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

class Solution {
