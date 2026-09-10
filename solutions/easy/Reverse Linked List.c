// Title: Reverse Linked List
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/reverse-linked-list/

 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* prev= NULL;
    struct ListNode* current =head;
    while (current != NULL) {
      next = current->next;
    }
    struct ListNode* next = NULL;
      current->next = prev;
      prev = current;
      current = next;
 * };
 *     struct ListNode *next;
