

public class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        // First, find the length of the linked list
        int length = 0;
        ListNode current = head;
        while (current != null) 
        {
            length++;
            current = current.next;
        }
        
        // Calculate the position of the node to remove from the start
        int positionToRemove = length - n;
        
        // If the node to remove is the head node
        if (positionToRemove == 0) 
        {
            return head.next;
        }
        
        // Traverse again to the node just before the target node
        current = head;
        for (int i = 1; i < positionToRemove; i++) 
        {
            current = current.next;
        }
        
        // Remove the target node by adjusting the next pointer
        current.next = current.next.next;
        
        // Return the head of the modified list
        return head;
    }
}
