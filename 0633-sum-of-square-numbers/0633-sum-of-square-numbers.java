class Solution 
{
    public boolean judgeSquareSum(int c) 
    {
        boolean ans=false;
        HashSet<Integer> set=new HashSet<>();

        int range=(int)Math.sqrt(c);

        for(int i=0;i<=range;i++)
        {
            set.add(i*i);
        }       

        for(int i:set)
        {
            int complement=c-i;
            if(set.contains(complement))
            {
                ans=true;
            }
        }
        return ans;
    }
}