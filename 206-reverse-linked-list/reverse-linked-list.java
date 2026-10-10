/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //following pointer method is used here
        ListNode q = null;//previous pointer
        ListNode p = head;//current pointer

        while (p != null) {
            ListNode next = p.next;
            p.next = q;
            q = p;
            p = next;
        }

        return q;
    }
}