// Title: Minimum Common Value
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/minimum-common-value/

    int n = nums1Size, m = nums2Size;
    int i = 0, j = 0;
    while (i < n && j < m) {
        if (nums1[i] == nums2[j])
            return nums1[i];
        else if (nums1[i] < nums2[j])
            i++;
        else
            j++;
    }
    return -1;
}
int getCommon(int* nums1, int nums1Size, int* nums2, int nums2Size) {
