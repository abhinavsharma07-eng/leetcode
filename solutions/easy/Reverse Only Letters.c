// Title: Reverse Only Letters
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/reverse-only-letters/

            i++;
        else if (!isalpha(s[j]))
            j--;
        else {
            int temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
        if (!isalpha(s[i]))
    i = 0, j = size - 1;
    while (i <= j) {
    while (s[i] != '\0') {
        size++;
        i++;
    }
            j--;
        }
