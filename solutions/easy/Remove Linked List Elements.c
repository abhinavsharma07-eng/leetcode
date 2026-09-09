// Title: Remove Linked List Elements
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/remove-linked-list-elements/

struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode* dummy = malloc(sizeof(struct ListNode));
    dummy->next = head;

 */
    while (temp!= NULL && temp->next!= NULL) {
        if (temp->next->val == val) {
            temp->next = temp->next->next;
        } else
    struct ListNode *temp = dummy;
            temp = temp->next;
    }
    return dummy->next;
}
 * };
