/*

       ----> Alternate way<-----

       int[] result = new int[T.length];
       Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < T.length; i++)
        {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) 
            {
                int idx = stack.pop();
                result[idx] = i - idx;  // Calculate the number of days
            }
            stack.push(i);  // Push the current index onto the stack
        }
        
        return result;

*/


class Solution 
{
    public int[] dailyTemperatures(int[] temperatures)
    {
        Stack<Integer> stack=new Stack<>();
        int n=temperatures.length;
        int res[]=new int[n];

        for(int idx=n-1;idx>=0;idx--)
        {

            while(!stack.isEmpty() && temperatures[idx]>=temperatures[stack.peek()])
            {
                stack.pop();
            }

            if(!stack.isEmpty())
            {
                res[idx]=stack.peek()-idx;
            }

            stack.push(idx);

        }

        return res;




        
    }
}