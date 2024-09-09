/*          NOTE-->

In your code, stack.peek() and minstack.peek() return Integer objects, not primitive int values. When you use ==, it checks if the two Integer objects reference the same memory location, which is not necessarily true even if they have the same value. Therefore, the condition might not be true even if the values are the same.

On the other hand, .equals() compares the values of the Integer objects, which is why it works correctly for your purpose.

 */

class MinStack 
{
    Stack<Integer> stack;
    Stack<Integer> minstack;

    public MinStack() 
    {
        stack=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int val) 
    {
        stack.push(val);
        if(minstack.isEmpty() || minstack.peek()>=stack.peek())
        {
            minstack.push(val);
        }
        
    }
    
    public void pop() 
    {
        if(stack.peek().equals(minstack.peek()))
        {
            minstack.pop();
        }
        stack.pop();
        
    }
    
    public int top() 
    {
        return stack.peek();
        
    }
    
    public int getMin() 
    {
        return minstack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */