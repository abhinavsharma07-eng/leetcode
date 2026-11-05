// Title: Peak Index in a Mountain Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/

                peak = mid;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return peak;
    }
