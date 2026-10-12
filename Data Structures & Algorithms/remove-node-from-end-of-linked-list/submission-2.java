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
        if(head == null) return null;
        
        ListNode right = head;

        int i;
        for (i = 0; i < n; i++) {
            if(right == null) break;// nth
            right = right.next;
            
        }
        
        if(right == null) return head.next;

        ListNode left = head.next;
        right = right.next;
        ListNode prev = head;
        while(right != null) {
            right = right.next;
            left = left.next;
            prev = prev.next;
        }
        
        
        prev.next = left.next;
        left.next = null;
       
        return head;


        
    }
}
