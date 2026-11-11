// Title: Remove Linked List Elements
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/remove-linked-list-elements/

        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else
                temp = temp.next;
        }
        return dummy.next;
    }
}
    public ListNode removeElements(ListNode head, int val) {
