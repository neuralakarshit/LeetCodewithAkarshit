class Solution {
    public int dominantIndex(int[] nums) 
    {
        int max=Integer.MIN_VALUE;
        int pos=-1;
        int ans=-1;
        boolean f=false;

        if(nums.length==1)
        {
            return 0;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                pos=i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(i!=pos)
            {

               if((2*nums[i]<=max))
                {
                 f=true;
                }
               else
                {
                f=false;
                break;
                }
            }
        }
        if(f)
        {
            ans= pos;
        }
        else if(!f)
        {
            ans= -1;
        }
        return ans;
        
    }
}