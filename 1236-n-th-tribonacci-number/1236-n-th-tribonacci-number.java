class Solution {
    public int tribonacci(int n) 
    
    {
       int a=0;
       int b=1;
       int c=1;
       int d=0;

       if(n==0)
       {
        return n;
       }
       else if(n==1 || n==2)
       {
          return 1;
       } 
       else
       {
             for(int i=2;i<n;i++)
             {
                d=a+b+c;
                a=b;
                b=c;
                c=d;
             }
            return d;
        }
        
    }
}