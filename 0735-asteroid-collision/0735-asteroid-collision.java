class Solution 
{
    public int[] asteroidCollision(int[] a) 
    
    {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < a.length; i++) 
        {
            if (stack.isEmpty() || a[i] > 0) 
            {
                stack.push(a[i]);
            } 

            else 
            {
                // Handle collision with a negative asteroid
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(a[i])) 
                {
                    stack.pop();  // Pop the smaller positive asteroid
                }
                
                // If the stack is empty or the top is negative, push the current asteroid
                if (stack.isEmpty() || stack.peek() < 0) 
                {
                    stack.push(a[i]);
                } 
                
                else if (stack.peek() == Math.abs(a[i])) 

                {
                    // Equal in size but opposite directions, both destroy each other
                    stack.pop();
                }
                // Else the current negative asteroid is destroyed (no need to push it)
            }
        }


        // Convert stack to an array
        int[] result = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--)
        {
            result[i] = stack.pop();
        }

        return result;
    }
}
