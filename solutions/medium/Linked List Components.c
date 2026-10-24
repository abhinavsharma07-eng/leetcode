// Title: Linked List Components
            // Difficulty: Medium
            // Language: C
            // Link: https://leetcode.com/problems/linked-list-components/

int numComponents(struct ListNode* head, int* nums, int numsSize) {
    bool* inSet = calloc(10000, sizeof(bool));
    for (int i = 0; i < numsSize; i++)
        inSet[nums[i]] = true;
    int count = 0;
    for (struct ListNode* cur = head; cur; cur = cur->next) {
        if (inSet[cur->val] && (!cur->next || !inSet[cur->next->val]))
            count++;
    }
    free(inSet);
    return count;
}
