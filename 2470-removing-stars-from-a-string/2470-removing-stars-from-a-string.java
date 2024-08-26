class Solution {
    public String removeStars(String s) 
    {
        if(s.length()==0)
        {
            return s;
        }
        String s1="";
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!='*')
            {
                stack.push(c);
            }  
            else
            {
                stack.pop();
            }

        }
           while(!stack.isEmpty())
           {
              s1=stack.pop()+s1;
           }
           return s1;
        
        
    }
}