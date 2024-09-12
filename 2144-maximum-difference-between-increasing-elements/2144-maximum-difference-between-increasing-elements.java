class Solution 
{
    public int maximumDifference(int[] nums) 
    {
        if(nums.length==1)
        {
            return -1;
        }

        int minvalue=nums[0];
        int max=Integer.MIN_VALUE;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>minvalue)
            {
            max=Math.max(max,nums[i]-minvalue);
            }
            minvalue=Math.min(minvalue,nums[i]);
        }
          
          if(max==Integer.MIN_VALUE)
          {
            return  -1;
          }
          else
          {
            return max;
          }
        
    }
}