class Solution 
{
    public int maxArea(int[] height) 
    
    {

        int maxCapacity=-1;

        int start=0;
        int end=height.length-1;
        

        while(start<end)
        {
            int w=end-start;
            int h=Math.min(height[start],height[end]);

            int CurrCapacity=w*h;

            maxCapacity=Math.max(maxCapacity,CurrCapacity);

            if(height[start]<=height[end])
            {
               start++;
            }
            else if(height[end]<=height[start])  //<= necessaryotherwise TLE Error!
            {
                end--;

            }

        }
        return maxCapacity;


        
    }
}