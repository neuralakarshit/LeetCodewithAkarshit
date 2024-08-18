/**
 * Definition for singly-linked list.
 * class ListNode {
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
  
    public ListNode detectCycle(ListNode head)
    {
        
       ListNode slow=head;
       ListNode fast=head;
       ListNode temp=head;
       Boolean CycleExists=false;
        int p=-1;


         while(fast!=null && fast.next!=null)
        {
          slow=slow.next;
          fast=fast.next.next;

          if(slow==fast)
          {
            CycleExists = true;
            break;
          }
        }
        

        if(CycleExists)
        {
            while(temp!=slow)
            {
                temp=temp.next;
                slow=slow.next;
                p++;
            }
            
            return temp;
        }
        else
        {
           p=-1;
           return null;
        }
        
    }
}