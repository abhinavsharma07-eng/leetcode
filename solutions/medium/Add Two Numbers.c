// Title: Add Two Numbers
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/add-two-numbers/

            sum += l2->val;
            l2 = l2->next;
        }
        carry = sum / 10;
        curr->next = malloc(sizeof(struct ListNode));
        curr->next->val = sum % 10;
        curr->next->next = NULL;
        curr = curr->next;
    }
    curr = dummy->next;
        if (l2 != NULL) {
        }
            l1 = l1->next;
            sum += l1->val;
        if (l1 != NULL) {
        int sum = carry;
    while (l1 != NULL || l2 != NULL || carry != 0) {
    struct ListNode* curr = dummy;
