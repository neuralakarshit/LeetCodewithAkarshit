//NOTE--> NOT EFFECTIVE APPROACH CAUSE S.C=O(n){String bUilder}
// alternative way- Using Stack

/*
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        Stack<Integer> stack = new Stack<>();
        ListNode current = head;

        // Push all elements of the linked list onto the stack
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        // Traverse the list again and compare with the stack
        current = head;
        while (current != null) {
            if (current.val != stack.pop()) {
                return false; // Not a palindrome
            }
            current = current.next;
        }

        return true; // Palindrome
    }
}






 */



class Solution
 {
    public boolean isPalindrome(ListNode head) 
    {
        if (head == null || head.next == null) return true;

        // Convert linked list to string
        StringBuilder sb = new StringBuilder();
        ListNode current = head;
        while (current != null) 
        {

            sb.append(current.val);
            current = current.next;
        }

        // Check if the string is a palindrome
        String original = sb.toString();
        String reversed = sb.reverse().toString();

        return original.equals(reversed);
    }
}

