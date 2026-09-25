// Title: Third Maximum Number
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/third-maximum-number/

                if (third < mid)
            if ((mid < nums[i]) && (nums[i] < first)) {
            }
                first = nums[i];
                    third = mid;
                mid = nums[i];
            }
            if ((third < nums[i]) && (nums[i] < mid)) {
                third = nums[i];
            }
        }
