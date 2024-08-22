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

    public ListNode reverseList(ListNode head) 
    {
        ListNode prev = null;
        ListNode current = head;
        while (current != null)
         {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) 
    {
         ListNode temp=reverseList(head);
         int carry=0;
         int sum=0;
         ListNode n =new ListNode(-1);
         ListNode node=n;
         while(temp!=null)
         {
              int value=(temp.val*2)+carry;
              sum=value%10;
              carry=value/10;
              node.next = new ListNode(sum);
              node=node.next;
              temp=temp.next;
         }

         if(carry>0)
         {
            node.next=new ListNode(carry);
         }


        ListNode temp1=n.next;
        ListNode prev1 = null;
        ListNode current1 = temp1;
        while (current1 != null)
         {
            ListNode nextNode1 = current1.next;
            current1.next = prev1;
            prev1 = current1;
            current1 = nextNode1;
        }
         temp1=prev1;

        return temp1;
    }
}