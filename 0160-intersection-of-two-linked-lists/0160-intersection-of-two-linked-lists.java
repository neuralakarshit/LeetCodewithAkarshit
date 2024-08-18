/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution
 {
    public int sizeLL(ListNode head)
    {

        ListNode temp=head;
         int c=0;
        while(temp!=null)
        {
            temp=temp.next;
            c++;
        }
        return c;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
         if(headA==null || headB==null)
         {
            return null;
         }
         int size1=sizeLL(headA);
         int size2=sizeLL(headB);

         int dif=size1 - size2;
         ListNode tempA=headA;
         ListNode tempB=headB;
         if(dif>0)
         {
            while(dif>0)
            {
            tempA=tempA.next;
            dif--;
            }
         }
         else if(dif<0)
         {
            while(dif<0)
            {
            tempB=tempB.next;
            dif++;
            }
         }

         while(tempA!=tempB)
         {
            tempA=tempA.next;
            tempB=tempB.next;
         }

         return tempA;



    }
}