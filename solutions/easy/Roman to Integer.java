// Title: Roman to Integer
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
      Map<Character,Integer> inv = Map.of('I', 1, 'V', 5, 'X' ,10, 'L', 
      50, 'C', 100, 'D', 500, 'M', 1000);
       int sum = inv.get(s.charAt(s.length() -1));
       for(int i = s.length()-2; i>= 0 ;i--){
            if(sum > inv.get(s.charAt(i))){
                if(s.charAt(i) == s.charAt(i+1)) sum += inv.get(s.charAt
                (i));
                else sum -= inv.get(s.charAt(i));
            }
            else sum += inv.get(s.charAt(i));
