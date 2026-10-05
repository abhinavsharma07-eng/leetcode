// Title: Find the Highest Altitude
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int high = 0;
        int currAlt = 0;
        for (int i = 0; i < gain.length; i++) {
            currAlt += gain[i];
            if (currAlt > high)
                high = currAlt;
        }
        return high;
    }
}
