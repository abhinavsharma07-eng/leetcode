// Title: Height Checker
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/height-checker/

        for (int i = 0; i < heights.length; i++)
            if (heights[i] != arr[i])
                count++;
        return count++;

    }
        int count = 0;
        Arrays.sort(heights);
}
