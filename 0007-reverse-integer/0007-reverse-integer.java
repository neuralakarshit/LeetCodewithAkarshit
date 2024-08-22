class Solution 
{
    public int reverse(int x)
    {
        int reverse=0;
        while(x!=0)
        {
            int d=x%10;
           if(reverse>0 && reverse>(Integer.MAX_VALUE -d)/10 || reverse<0 
            && reverse<(Integer.MIN_VALUE -d)/10)
            {
                return 0;
            }
            reverse=reverse*10+d;
            x=x/10;

        }
        return reverse;
        
    }
}