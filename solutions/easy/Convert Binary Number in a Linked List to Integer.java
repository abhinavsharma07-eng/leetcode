// Title: Convert Binary Number in a Linked List to Integer
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

        int num = 0;
        ListNode temp = head;
        while (temp != null) {
            num = (num << 1) | temp.val;
            temp = temp.next;
        }
        return num;
    }
}

    public int getDecimalValue(ListNode head) {
class Solution {
