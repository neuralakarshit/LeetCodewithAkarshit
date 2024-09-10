class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        Integer ans=null;

        for(int i=0;i<nums.length;i++)
        {
            int idx=Math.abs(nums[i]);

            if(nums[idx]<0)
            {
                ans=idx;
                break;
            }
            nums[idx]=-nums[idx];
        }
       for(int i=0;i<nums.length;i++)
       {
           nums[i]=Math.abs(nums[i]);
       }

       return ans;
    }
}