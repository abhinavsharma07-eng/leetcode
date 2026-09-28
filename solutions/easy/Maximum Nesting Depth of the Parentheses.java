// Title: Maximum Nesting Depth of the Parentheses
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

        int count = 0;
        int tempCount = 0;
    public int maxDepth(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                tempCount++;
            if (s.charAt(i) == ')'){
                if(count < tempCount) count = tempCount;
                tempCount--;
            }
        }
        return count;
    }
}
