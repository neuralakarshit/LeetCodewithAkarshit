class MyQueue 
{
     Stack<Integer> s1;
     Stack<Integer> s2;// using as main Stack !
      
    public MyQueue() 
    {
        s1=new Stack<>();
        s2=new Stack<>();
        
    }
    
    public void push(int x) 
    {
        /*

        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }                           here,T.C--> O(n) for each while loop not in O(1)
        s2.push(x);
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }

        */  


        // where each operation in o(1)
        
        s2.push(x);
        
    }
    
    public int pop() 
    {
       // return s2.pop();

       peek();// reverse original stack(s2) by transferring elem to stack1
return s1.pop();//reversed stack in s1 returns top elem as last from original stack 
        
    }
    
    public int peek() 
    {
       // return s2.peek();

       if(s1.isEmpty())
       {
        while(!s2.isEmpty())
        {
            s1.push(s2.pop()); // reverses stack by transferring elem to s1
        }
       }

       return s1.peek();
        
    }
    
    public boolean empty() 
    {
        return s2.isEmpty() && s1.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */