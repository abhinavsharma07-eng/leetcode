// Title: Fibonacci Number
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/fibonacci-number/

int found[32] = {0};
int fib(int n) {
    if (n == 0)
        return 0;
    if (n == 1)
        return 1;
    if (found[n] == 0)
        found[n] = fib(n - 1) + fib(n - 2);

    return found[n];
}
