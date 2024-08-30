class MyStack 
{
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack()
    {
        q1=new LinkedList<>();
        q2=new LinkedList<>(); //using as main queue
        
    }
    
    public void push(int x)
    {
      /*  while(!q2.isEmpty())            
        {
            q1.offer(q2.poll());

        }
        q2.offer(x);
        while(!q1.isEmpty())
        {
            q2.offer(q1.poll());
        }
        */ 

        // using only one queue !

        int size = q2.size();
        q2.offer(x);

        while(size>0)
        {
            q2.offer(q2.poll());
            size--;
        }
    }
    
    public int pop() 
    {
       return q2.poll();
        
    }
    
    public int top() 
    {
        return q2.peek();
        
    }
    
    public boolean empty() 
    {
        return q2.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */