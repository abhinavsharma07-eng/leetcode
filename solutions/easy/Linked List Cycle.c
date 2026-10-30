// Title: Linked List Cycle
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/linked-list-cycle/

    while (fast && fast->next) {
        slow = slow->next;
        fast = fast->next->next;
        if (slow == fast)
            return true;
    }
    return false;
}
    struct ListNode* entry = head;
    struct ListNode* fast = head;
    struct ListNode* slow = head;
