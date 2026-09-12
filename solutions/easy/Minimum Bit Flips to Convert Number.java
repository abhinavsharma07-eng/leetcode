// Title: Minimum Bit Flips to Convert Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/minimum-bit-flips-to-convert-number/

class Solution {
    public int minBitFlips(int start, int goal) {
        int result = start^goal;
        int count =0;
        while(result!=0){
            if((result & 1)==1)
            count ++;
            result /=2;
        }
        return count;
    }
}
