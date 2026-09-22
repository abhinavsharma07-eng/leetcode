// Title: Intersection of Two Arrays
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/intersection-of-two-arrays/



            if (nums1[i] == nums2[j]) {
        for (int j = 0; j < nums2Size; j++) {


    for (int i = 0; i < nums1Size; i++) {
                if (found[nums1[i]] == 0) {
                    result[*returnSize] = nums1[i];
                    (*returnSize)++;
                    found[nums1[i]] = 1;
                }

                break;
            }
        }
    }
