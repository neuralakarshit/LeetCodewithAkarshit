import java.util.Stack;
class Solution {
    public boolean isValid(String s) 
    
    {
        char[]chars=s.toCharArray();

         Stack<Character>stk=new Stack<>();
         for(int i=0;i<chars.length;i++)
         {

             if(chars[i]=='('||chars[i]=='{'||chars[i]=='[')
             {
                   stk.push(chars[i]);
             }


             else if(chars[i]==')')
             {
                if(stk.isEmpty() || stk.peek()!='(')
                {
                    return false;
                }
                else
                {
                    stk.pop();
                }
             }

               else if(chars[i]=='}')
             {
                if(stk.isEmpty() || stk.peek()!='{')
                {
                    return false;
                }
                else
                {
                    stk.pop();
                }
             }

                else if(chars[i]==']')
             {
                if(stk.isEmpty() || stk.peek()!='[' )
                {
                    return false;
                }
                else
                {
                    stk.pop();
                }
             }  

         }
         
             if(!stk.isEmpty())
             {
                  
                  return false;
             }

         return true;

        
    }
}