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
     -->Alternative

      if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;            // Pointer for odd nodes
        ListNode even = head.next;      // Pointer for even nodes
        ListNode evenHead = even;       // Store the head of the even nodes

        while (odd != null && odd.next != null && even != null && even.next != null) {
            odd.next = odd.next.next;   // Skip the next even node, connect to the next odd node
            odd = odd.next;             // Move odd pointer to the next odd node

            even.next = even.next.next; // Skip the next odd node, connect to the next even node
            even = even.next;           // Move even pointer to the next even node
        }

        // Connect the end of the odd list to the head of the even list
        odd.next = evenHead;

        return head;
 
 
  */
class Solution {
    public ListNode oddEvenList(ListNode head) 
    {
         if (head == null || head.next == null)
        {
            return head;
        }

        ListNode odd = head;         // Pointer for odd nodes
        ListNode even = head.next;   // Pointer for even nodes
        ListNode evenHead = even;    // Store the head of the even nodes

        while (even != null && even.next != null) 
        {
            odd.next = even.next;    // Link the next odd node
            odd = odd.next;          // Move odd pointer to the next odd node

            even.next = odd.next;    // Link the next even node
            even = even.next;        // Move even pointer to the next even node
        }

        odd.next = evenHead;         // Connect the end of odd list to the head of the even list

        return head;
       
        
    }
}