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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {

        // Create a dummy node to serve as the start of the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy; // Pointer to build the new list

        ListNode p1 = list1;
        ListNode p2 = list2;

        
        while (p1 != null && p2 != null) 
        {
            if (p1.val < p2.val) 
            {
                current.next = p1;
                p1 = p1.next;
            } 
            else 
            {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }

        // Append the remaining nodes of the non-empty list
        if (p1 != null) 
        {
            current.next = p1;
        } 
        else 
        {
            current.next = p2;
        }

        dummy=dummy.next; // deleting -1 data taken by default-start of new node or to make node
        return dummy;
        
    }
}