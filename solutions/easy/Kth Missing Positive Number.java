// Title: Kth Missing Positive Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/kth-missing-positive-number/

            i++;
        }
        return i - 1;
    }
}
        int i = 1;
        while (count != k) {
            if (!set.contains(i))
                count++;
