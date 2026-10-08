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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode merged = new ListNode();
        ListNode head = merged;

        // check empty
        if(list1 == null) return list2;
        else if(list2 == null) return list1;

        while( list1 != null & list2 != null) {
            
            if(list1.val < list2.val) {
                merged.val = list1.val;
                list1 = list1.next;
            } else {
                merged.val = list2.val;
                list2 = list2.next;
            }
            if( list1 == null || list2 == null) break;
            merged.next = new ListNode();
            merged = merged.next;
            
        }

        
        ListNode listEnd = null;

        if(list1 == null) {
            listEnd = new ListNode(list2.val , list2.next);
        } else if (list2 == null) {
            listEnd = new ListNode(list1.val, list1.next);
        }
        merged.next = listEnd;
        return head;
    }
}