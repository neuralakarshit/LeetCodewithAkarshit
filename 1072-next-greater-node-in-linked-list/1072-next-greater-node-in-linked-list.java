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

 /*

class Solution  
{
    public int[] nextLargerNodes(ListNode head)   
    {
        
        ListNode temp = head;
        int p = 0;
        while(temp != null)
        {
            temp = temp.next;
            p++;
        }

        int[] answer = new int[p];
        int idx = 0;

        
        temp = head;

       
        while(temp != null) 
        {
            ListNode current = temp.next;
            while(current != null)
            {
                // If a larger node is found, store its value and break
                if(current.val > temp.val)
                {
                    answer[idx] = current.val;
                    break;
                }
                current = current.next; 
            }

            // If no larger node was found, set the answer to 0
            if(current == null)
            {
                answer[idx] = 0;
            }

            idx++; 
            temp = temp.next; 
        }

        return answer;
    }
}

*/

class Solution  
{

    public int sizeLL(ListNode head)
    {
        
        ListNode temp = head;
        int p = 0;
        while(temp != null)
        {
            temp = temp.next;
            p++;
        }
        return p;

    }

    public ListNode reverseLL(ListNode head)
    {
        ListNode prev=null;
        ListNode cur=head;
        ListNode next=null;

        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;

        }
        return prev;

    }
    public int[] nextLargerNodes(ListNode head)   
    {
        int size=sizeLL(head);
        int[] answer = new int[size];
        ListNode nHead=reverseLL(head); // reversed LL
        

        ListNode cur = nHead.next;

        int ptr=size-2;

        Stack<Integer> s=new Stack<>();
        s.push(nHead.val);

        while(ptr>=0)
        {
            int element=cur.val;
            cur=cur.next;

            while(s.size()>0 && s.peek()<=element)
            {
                s.pop();
            }
            if(s.size()==0)
            {
                answer[ptr]=0;
            }
            else
            {
                answer[ptr]=s.peek();
            }
            ptr--;
            s.push(element);
        }
        return answer;
    }

}


























