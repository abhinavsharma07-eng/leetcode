// Title: Partition List
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/partition-list/

    struct ListNode* after_head = createNode(0);
    struct ListNode* before_head = createNode(0);
    struct ListNode* after = after_head;
    struct ListNode* before = before_head;
    struct ListNode* temp = head;
    while (temp != NULL) {
        if (temp->val < x) {
            before->next = createNode(temp->val);
            before = before->next;
        } else {
            after->next = createNode(temp->val);
            after = after->next;
        }
        temp = temp->next;
    }
    before->next = after_head->next;
    return before_head->next;
}
