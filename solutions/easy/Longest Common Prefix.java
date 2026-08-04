// Title: Longest Common Prefix
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = Integer.MAX_VALUE;
        for(String  s: strs){
            if (len > s.length())  len = s.length();
        }

        StringBuilder str=new StringBuilder("");
        for(int i =0;i <len;i++){
            char a = strs[0].charAt(i);
              for(int j =1; j< strs.length ;j++){
                if (a!= strs[j].charAt(i)) return str;
