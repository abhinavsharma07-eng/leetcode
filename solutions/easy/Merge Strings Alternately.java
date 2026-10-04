// Title: Merge Strings Alternately
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/merge-strings-alternately/

        for (i = 0; i < size; i++) {
            str = str + word1.charAt(i);
            str = str + word2.charAt(i);
        }
        if (size < word1.length()) {
            str = str + word1.substring(i);
        }
        if (size < word2.length()) {
            str = str + word2.substring(i);
        }
        return str;
    }
}
        int i;
        word2.length();
        int size = (word1.length() < word2.length()) ? word1.length() : 
        String str = "";
    public String mergeAlternately(String word1, String word2) {
class Solution {
