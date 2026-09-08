// Title: Middle of the Linked List
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/middle-of-the-linked-list/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode *fast= head;
    struct ListNode *slow=head;
    while(fast!=NULL && fast->next!=NULL){
        fast = fast->next->next;
        slow= slow->next;        
    }
    return slow;
}
