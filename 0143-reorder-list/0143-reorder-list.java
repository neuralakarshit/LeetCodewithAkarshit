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
    public void reorderList(ListNode head) 
    {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;
        ListNode last=slow.next;
        slow.next=null;
        ListNode next=null;

        while(last!=null)
        {
            next=last.next;
            last.next=prev;
            prev=last;
            last=next;
        }

        last=prev;
        ListNode start=head;

        while(last!=null)
        {
            ListNode temp1 = start.next;
            ListNode temp2 = last.next;
            start.next = last;
            last.next = temp1;
            start = temp1;
            last = temp2;
        }

        
    }
}