class Solution {
    public boolean isPalindrome(int x) 
    {
        int n=x;
           int rev=0;
            if(x<0)
            { return false;
            }
            while(n>0)            
            {
                 int d = n%10;
                 rev=rev*10+d;
                 n=n/10;
            }
            if(rev==x)
            {
                return true;
            }
            else
            {
                return false;
            }
    }
}