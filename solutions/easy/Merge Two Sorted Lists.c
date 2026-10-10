// Title: Merge Two Sorted Lists
            // Difficulty: Easy
            // Language: C
            // Link: https://leetcode.com/problems/merge-two-sorted-lists/

    struct ListNode dummy;
    struct ListNode* temp = &dummy;
    while (list1 != NULL && list2 != NULL) {
        if (list2->val > list1->val) {
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* 
list2) {

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
