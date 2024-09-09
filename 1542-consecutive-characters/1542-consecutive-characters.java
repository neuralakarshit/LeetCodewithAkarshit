class Solution 
{
    public int maxPower(String s) 
    {
        int c=1;
        int ans=1;
        for(int i=1;i<s.length();i++)
        {
            char curc=s.charAt(i);
            char prevc=s.charAt(i-1);

            if(curc==prevc)
            {
                c++;
                ans=Math.max(ans,c);

            }
            else
            {
                c=1;
            }
        }
        return ans;
    }
}