// Title: Find Smallest Letter Greater Than Target
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

target) {
    int lo = 0;
    int hi = lettersSize - 1;
    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if ((int)letters[mid] <= (int)target)
            lo = mid + 1;
        else
            hi = mid - 1;
    }
    return letters[lo % lettersSize];
}
