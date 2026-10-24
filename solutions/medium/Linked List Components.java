// Title: Linked List Components
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/linked-list-components/

        while (curr != null) {
            if (set.contains(curr.val) && (curr.next == null || !set.
            contains(curr.next.val)))
                count++;

            curr = curr.next;
        }

        return count;
    }

        ListNode curr = head;
        int count = 0;

        }
