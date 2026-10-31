// Title: Single Element in a Sorted Array
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/single-element-in-a-sorted-array/

        int mid = srt + (end - srt) / 2;
        if (mid % 2 == 1)
            mid--;
        if (nums[mid] == nums[mid + 1])
            srt = mid + 2;
        else
            end = mid;
    }
    return nums[srt];
}
