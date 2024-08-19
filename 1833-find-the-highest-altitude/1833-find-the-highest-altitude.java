class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int maxHeight=0;
        int curHeight=0;

        for(int i=0;i<gain.length;i++)
        {
            curHeight+=gain[i];
            maxHeight=Math.max(maxHeight,curHeight);
        }

        return maxHeight;
    }


}