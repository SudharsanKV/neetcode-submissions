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
        if(head == null){return head;}
        int count = 1;
        //Reverse the LinkedList
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        //Remove the Nth node
        curr = prev;
        ListNode temp = curr;
        while(temp != null){
            if(n==1){
                curr = curr.next;
                break;
            } else if((n == (count+1)) && temp.next != null){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
            count++;
        }
        

        //Reverse it again
        prev = null;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;

    }
}
