// Title: Palindrome Linked List
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/palindrome-linked-list/

        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current = head;
        while (prev.next != null) {
            if (prev.val != current.val)
                return false;
            prev = prev.next;
            current = current.next;
        }
        return true;
    }
}
