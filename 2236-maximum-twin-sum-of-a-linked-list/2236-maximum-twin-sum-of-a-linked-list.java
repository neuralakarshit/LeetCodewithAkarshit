

class Solution 
{
    public int pairSum(ListNode head)
     {
        if (head == null || head.next == null) 
        {
          return 0;
        }

        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null)
         {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = null;
        while (curr != null) 
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Calculate the twin sums and find the maximum
        int maxTwinSum = 0;
        ListNode firstHalf = head;
        ListNode secondHalf = prev; // The start of the reversed second half
        
        while (secondHalf != null) 
        {
            int twinSum = firstHalf.val + secondHalf.val;
            maxTwinSum = Math.max(maxTwinSum, twinSum);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
// Step 4 (Optional): Restore the second half of the list (not required for the problem)
        // curr = prev;
        // prev = null;
        // while (curr != null) {
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }

        // Step 5: Return the maximum twin sum
        return maxTwinSum;
    }
}
