// Title: Hamming Distance
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/hamming-distance/

int hammingDistance(int x, int y) {
    int xor = x ^ y;
    int count = 0;
    while (xor!= 0) {
        if (xor&1 == 1)
            count++;
        xor /= 2;
    }
    return count;
}
