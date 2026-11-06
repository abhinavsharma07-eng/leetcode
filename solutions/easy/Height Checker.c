// Title: Height Checker
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/height-checker/

        }

    for (int i = 0; i < heightsSize; i++)
        if (heights[i] != temp[i])
            count++;
    return count;
}
