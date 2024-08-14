class Solution {
    public int maxAscendingSum(int[] nums) 
    {
        int maxSubsum=nums[0];
        int sum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
               if(nums[i]>nums[i-1])
               {
                sum=sum+nums[i];
               }
               else
               {
                sum=0;
                sum=sum+nums[i];
               }
               maxSubsum=Math.max(maxSubsum,sum);

        }
        return maxSubsum;
        
    }
}