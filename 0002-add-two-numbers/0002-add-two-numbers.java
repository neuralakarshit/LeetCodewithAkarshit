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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {

        if(l1==null)
        {
            return l2;
        }
        else if(l2==null)
        {
            return l1;
        }

        ListNode temp=new ListNode(0);
        ListNode head=temp;
        int carry=0;

       while(l1!=null || l2!=null)
       {
          if(l1!=null)
          {
             carry+=l1.val;
             l1=l1.next;

          }
          if(l2!=null)
          {
            carry+=l2.val;
            l2=l2.next;
          }

          temp.next =new ListNode(carry%10);
          temp=temp.next;

          carry=carry/10;
       }

          if(carry>0)
          {
            temp.next=new ListNode(carry);

          }

          return head.next;

        
    }
}