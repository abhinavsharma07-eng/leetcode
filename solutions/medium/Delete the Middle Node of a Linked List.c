// Title: Delete the Middle Node of a Linked List
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

    dummy.next = head;
    struct ListNode* slow = &dummy;
    while (fast->next != NULL && fast->next->next != NULL) {
        fast = fast->next->next;
        slow = slow->next;
    }
    if (fast->next != NULL)
        slow = slow->next;
    struct ListNode* temp = slow;
    temp->next = slow->next->next;
    return head;
}
    struct ListNode dummy;
    struct ListNode* fast = head;
