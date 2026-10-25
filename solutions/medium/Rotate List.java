// Title: Rotate List
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/rotate-list/

        if (k == 0)
            return head;
        ListNode newTail = head;
        for (int i = 1; i < size - k; i++)
            newTail = newTail.next;

        tail.next = head;
        head = newTail.next;
        newTail.next = null;
        return head;
    }
}
