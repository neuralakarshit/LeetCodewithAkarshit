class Solution 
{
    public String removeDuplicateLetters(String s) 
    {
         // Array to keep track of character frequency
        int[] freq = new int[26];
        for (char c : s.toCharArray())
         {
            freq[c - 'a']++;
        }
        
        // Stack to store result and boolean array to check if character is in stack
        Stack<Character> stack = new Stack<>();
        boolean[] inStack = new boolean[26];
        
        for (char c : s.toCharArray()) 
        {
            // Decrement the frequency of the current character
            freq[c - 'a']--;
            
            // If the character is already in the stack, skip it
            if (inStack[c - 'a']) 
            {
                continue;
            }
            
            // Pop characters that are larger than the current character and still appear later
            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0)
             {
                inStack[stack.pop() - 'a'] = false;  // Mark popped characters as not in the stack
            }
            
            // Push the current character onto the stack and mark it as in the stack
            stack.push(c);
            inStack[c - 'a'] = true;
        }
        
        // Convert the stack to a string
        StringBuilder result = new StringBuilder();
        for (char c : stack) 
        {
            result.append(c);
        }
        
        return result.toString();
        
    }
}