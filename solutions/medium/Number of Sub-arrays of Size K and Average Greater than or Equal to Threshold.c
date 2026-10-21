// Title: Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/

    for (int i = k; i < arrSize; i++) {
        sum = sum + arr[i] - arr[i - k];
        if (sum / k >= threshold)
        count++;
    if (sum / k >= threshold)
    int count = 0;
    }
        sum += arr[i];
    for (int i = 0; i < k; i++) {
    int sum = 0;
int numOfSubarrays(int* arr, int arrSize, int k, int threshold) {
