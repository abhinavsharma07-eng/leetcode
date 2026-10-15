// Title: Robot Return to Origin
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/robot-return-to-origin/

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U')
                originUD++;
        int originLR = 0;
        int originUD = 0;
    public boolean judgeCircle(String moves) {
class Solution {
            else if (moves.charAt(i) == 'L')
                originLR++;
            else if (moves.charAt(i) == 'R')
                originLR--;
            else
                originUD--;
        }
        return (originUD == 0 && originLR == 0);
    }
}
