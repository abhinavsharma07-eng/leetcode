// Title: Add to Array-Form of Integer
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/add-to-array-form-of-integer/

        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            list.add(k % 10);
            k /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}
    public List<Integer> addToArrayForm(int[] num, int k) {
class Solution {
