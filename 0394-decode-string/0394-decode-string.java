class Solution 
{
    public String decodeString(String s) 
    {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> mainStack = new Stack<>();
        int num = 0;
        
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);


            if (Character.isDigit(ch)) 
            {
                // Build the full number
                num = num * 10 + (ch - '0');
            } 
            else if (ch == '[') 
            {
                // Push the current number and reset it
                numberStack.push(num);
                num = 0;
                mainStack.push("[");
            } 
            else if (ch == ']') 
            {
                // Build the string inside the brackets
                String str = "";

                while (!mainStack.peek().equals("[")) 
                {
                    str = mainStack.pop() + str;
                }
                mainStack.pop(); // Remove the '[' from the stack
                

                int repeatCount = numberStack.pop();
                StringBuilder sb = new StringBuilder();

                while (repeatCount-- > 0) 
                {
                    sb.append(str);
                }
                mainStack.push(sb.toString());
            }
             else 
             {
                // It's a character, push it onto the stack
                mainStack.push(Character.toString(ch));
            }
        }

        // Build the final string
        StringBuilder ans = new StringBuilder();
        
        while (!mainStack.isEmpty()) 
        {
            ans.insert(0, mainStack.pop());
        }
        return ans.toString();
    }
}
