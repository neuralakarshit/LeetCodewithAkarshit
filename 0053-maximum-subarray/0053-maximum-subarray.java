class Solution {
    public int maxSubArray(int[] nums) 
    {
         int subsum=0;
         int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
             subsum=Math.max(subsum+nums[i],nums[i]);
             ans=Math.max(ans,subsum);

        }
        return ans;
        
    }
}