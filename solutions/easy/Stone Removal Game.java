// Title: Stone Removal Game
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/stone-removal-game/

class Solution {
    public boolean canAliceWin(int n) {
        int step = 0;
        for (int i = 10; i > 0; i--) {
            if (n < i) {
                if (step % 2 == 0)
                    return false;
                return true;
            }
            n = n - i;
            step++;
        }
        return false;
    }
}
