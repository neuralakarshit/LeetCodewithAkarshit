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
    public ListNode mergeKLists(ListNode[] lists) 

    {
        

        // Create a priority queue (min-heap)
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Use a for loop to add the head nodes of each list to the heap
        for (int i = 0; i < lists.length; i++) 
        {
            if (lists[i] != null) 
            {
                heap.offer(lists[i]);   // these are only head we're adding in this step
            }
        }

        // Create a dummy node to form the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Process the heap
        while (!heap.isEmpty()) 
        {
            // Extract the smallest node from the heap
            ListNode node = heap.poll();
            current.next = node; // Add it to the merged list
            current = current.next;

            // If there is a next node, add it to the heap
            if (node.next != null)   /* head prev added now we take next elem from that list and add to that list head and again from all lists min heap will take out!*/
            {
                heap.offer(node.next);
            }
        }

        // Return the merged list starting from dummy.next
        return dummy.next;

        
    }
}