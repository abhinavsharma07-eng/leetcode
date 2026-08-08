// Title: Fizz Buzz
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/fizz-buzz/

        int i =1;
        while (i<=n){
            
        List<String> list = new ArrayList<>();
class Solution {
    public List<String> fizzBuzz(int n) {
            if((i%3==0)&&(i%5==0)&&i>=3){
             list.add("FizzBuzz"); 
            }
            else if(i%3==0&&i>=3) list.add("Fizz");
            else if (i%5==0&&i>=5) list.add("Buzz");
            else list.add(Integer.toString(i));
            i++;
        }
        return list;
        
    }
}
