// Title: Climbing Stairs
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/climbing-stairs/

        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        }
        return memo.get(n);
    }
}
    private int climbStairs(int n, Map<Integer, Integer> memo) {
    }
        return climbStairs(n, memo);
        Map<Integer, Integer> memo = new HashMap<>();
