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
class Solution
 {
    public ListNode mergeNodes(ListNode head)
    {
        ListNode temp1=head.next;
        ListNode temp2=head.next;

        while(temp2!=null)
        {
            if(temp2.val!=0)
            {
                temp1.val+=temp2.next.val;
                temp2=temp2.next;
            }
            else
            {
                    temp1.next=temp2.next;
                    temp1=temp2.next;
                    temp2=temp2.next;
                
            }
        }
        return head.next;




    }
}