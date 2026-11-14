// Title: Intersection of Two Linked Lists
            // Difficulty: Easy
            // Language: Java
            // Link: https://leetcode.com/problems/intersection-of-two-linked-lists/

        while (tempA != null) {
            ListNode tempB = new ListNode(0, headB);
            while (tempB != null) {
                if (tempA.next == tempB.next)
                    return tempA.next;
                tempB = tempB.next;
            }
            tempA = tempA.next;
        }
        return null;
    }
}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = new ListNode(0, headA);
public class Solution {
 */
