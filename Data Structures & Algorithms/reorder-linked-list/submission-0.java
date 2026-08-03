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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode sHead= slow.next;
        slow.next = null;
        ListNode temp = null;
        ListNode dummy = null;
        while(sHead!=null){
            temp = sHead.next;
            sHead.next = dummy;
            dummy = sHead;
            sHead = temp;
        }
        ListNode rHead = dummy;
        ListNode t2 = null;
        ListNode fHead = head;
        
        while(fHead != null && rHead != null){
            temp = fHead.next;
            fHead.next = rHead;
            t2 = rHead.next;
            rHead.next = temp;
            fHead = temp;
            rHead = t2;
        }
        
    }
}
