// Title: Minimum Positive Sum Subarray
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/minimum-positive-sum-subarray/

int minimumSumSubarray(int* nums, int n, int l, int r) {
    int best = INT_MAX, len = l;
    while (len <= r) {
        for (int i = 0; i + len <= n; i++) {
            int sum = 0;
            for (int k = i; k < i + len; k++)
                sum += nums[k];
            if (sum > 0 && sum < best)
                best = sum;
        }
        len++;
    }
    return best == INT_MAX ? -1 : best;
}
