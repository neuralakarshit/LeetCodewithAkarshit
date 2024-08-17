class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        // If l1 is null, return l2 because there's nothing to add from l1.
        if (l1 == null) 
        {
            return l2;
        } 
        // If l2 is null, return l1 because there's nothing to add from l2.
        else if (l2 == null) 
        {
            return l1;
        }

        // Create a dummy node to store the result and initialize 'temp' to this dummy node.
        ListNode temp = new ListNode(0);
        // 'head' will be used to return the result, pointing to the dummy node initially.
        ListNode head = temp;
        // Initialize carry to 0, which will hold any carryover from addition.
        int carry = 0;

        // Loop until both l1 and l2 are fully processed.
        while (l1 != null || l2 != null) 
        {
            // If l1 is not null, add its value to carry and move to the next node.
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            // If l2 is not null, add its value to carry and move to the next node.
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }

            // Create a new node with the digit part of carry (carry % 10) and link it to temp.
            temp.next = new ListNode(carry % 10);
            // Move temp to the next node to continue building the result list.
            temp = temp.next;

        // Update carry with the carryover part (carry / 10) to be added in the next iteration.
            carry = carry / 10;
        }

        // After the loop, if there's any remaining carry, create a new node for it.
        if (carry > 0) 
        {
            temp.next = new ListNode(carry);
        }

        // Return the next node of the dummy node, which is the head of the result list.
        return head.next;
    }
}
