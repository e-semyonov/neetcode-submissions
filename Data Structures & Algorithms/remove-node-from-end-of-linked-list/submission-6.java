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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // must use dummy
        ListNode dummy = new ListNode(0, head);
        if(head == null) return null;
        ListNode left = dummy;
        ListNode right = head;

        
        while (n > 0) {
            right = right.next;
            n--;
        }
        
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        
        left.next = left.next.next;
               
        return dummy.next;
        
    }


    //without dummy
    public ListNode removeNthFromEndWithoutDummy(ListNode head, int n) {
    if (head == null) return null;
    ListNode first = head;
    for (int i = 0; i < n; i++) {
        if (first == null) throw new IllegalArgumentException("n too large");
        first = first.next;
    }
    if (first == null) return head.next; // removed head
    ListNode second = head;
    while (first.next != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return head;
}
}
