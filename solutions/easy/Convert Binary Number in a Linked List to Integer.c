// Title: Convert Binary Number in a Linked List to Integer
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

 * };
 */
int getDecimalValue(struct ListNode* head) {
     int num = 0;
       struct  ListNode * temp = head;
        while (temp != NULL) {
            num = (num << 1) | temp->val;
            temp = temp->next;
        }
        return num;
}
