// Title: Swapping Nodes in a Linked List
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/

 */
struct ListNode* swapNodes(struct ListNode* head, int k) {
    struct ListNode* front = head;
    struct ListNode* back = head;
    struct ListNode* temp = head;
    for (int i = 1; i < k; i++) {
        front = front->next;
    }
    temp = front;
    while (temp->next != NULL) {
        back = back->next;
        temp = temp->next;
    }
    int val = front->val;
    front->val = back->val;
    back->val = val;
    return head;
}
