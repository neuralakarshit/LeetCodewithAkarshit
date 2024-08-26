class Solution 
{
    public int trap(int[] height) 
    {
        int l=0;
        int r=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int ans=0;

        while(l<r)
        {
            if(leftmax<height[l])
            {
                leftmax=Math.max(leftmax,height[l]);
            }
            if(rightmax<height[r])
            {
                rightmax=Math.max(rightmax,height[r]);
            }

            if(leftmax<rightmax)
            {
                ans+=leftmax-height[l];
                l++;
            }
            else
            {
                ans+=rightmax-height[r];
                r--;
            }
        }
        return ans;
        
    }
}