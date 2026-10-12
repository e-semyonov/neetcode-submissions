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
    public boolean hasCycle(ListNode head) {
                ListNode startNode = null;

        if (head == null || head.next == null) return false;
        ListNode slow = head;//slow pointer, 1 step each iteration
        ListNode fast = head;//fast pointer, 2 steps each iteration

        boolean hasCycle = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if( slow == fast) {
                hasCycle = true;
                break;
            }
        }

        if (hasCycle) {// find
            
            slow = head;// start the slow pointer from the head and move the fast and the slow at the same rate
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            startNode = slow;
        }

        return startNode !=null;

    }
}
