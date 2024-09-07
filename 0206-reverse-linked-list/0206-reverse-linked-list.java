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


 // note -- iterative way- T.C=O(n) , S.C=O(1)
 //         recursive way- T.C=O(n) , S.C=O(n)
class Solution {
    public ListNode reverseList(ListNode head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode cur=head;
        ListNode next=null;

        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev; // here started reversing and changed pointer direction towards left
            prev=cur;
            cur=next;
        }
           head=prev; //In end prev will be on last node!
           return head;    
    }
}