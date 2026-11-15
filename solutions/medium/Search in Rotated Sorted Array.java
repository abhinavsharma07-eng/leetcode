// Title: Search in Rotated Sorted Array
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

                    hi = mid - 1;
                else
                    lo = mid + 1;
            } else {
                if (nums[mid] < target && nums[hi] >= target)
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
                if (nums[lo] <= target && nums[mid] > target)
            else if (nums[lo] <= nums[mid]) {
                return mid;
            if (nums[mid] == target)
            int mid = lo + (hi - lo) / 2;
