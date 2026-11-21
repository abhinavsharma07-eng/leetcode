// Title: Reverse Only Letters
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/reverse-only-letters/

    while (i <= j) {
        if (!isalpha(left[i]))
            i++;
        else if (!isalpha(right[j]))
            j--;
        else {
            int temp = left[i];
            left[i] = right[j];
            right[j] = temp;
            i++;
            j--;
        }
    }
    return s;
}
