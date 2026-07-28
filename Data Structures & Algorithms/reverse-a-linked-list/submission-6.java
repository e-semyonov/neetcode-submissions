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
    public ListNode reverseList0(ListNode head) {
        System.out.println(head);
        if(head == null) {return head;}
        ListNode nextN = head.next;
        if(nextN == null){
            return head;
        }
        ListNode node = reverseList(nextN);
        head.next = null;
        nextN.next = head;
        return node;
        
    }
    
        public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) {return head;}
        ListNode current = head.next;
        head.next = null;
        ListNode next = current.next;
        while(next != null){
            current.next = head;
            head = current;
            current = next;
            next = next.next;
        }
        current.next = head;
        head = current;
        return head;
        
    }

}
