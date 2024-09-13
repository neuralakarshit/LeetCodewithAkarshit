class Solution 
{
    public int maxSubarraySumCircular(int[] nums)
     {
        int totalsum = 0;
        int maxsum = nums[0], cursumMax = 0;
        int minsum = nums[0], cursumMin = 0;
        
        for (int i = 0; i < nums.length; i++) 
        {
            totalsum += nums[i];
            
            // Kadane's algorithm for the maximum subarray sum
            cursumMax = Math.max(cursumMax + nums[i], nums[i]);
            maxsum = Math.max(maxsum, cursumMax);
            
            // Kadane's algorithm for the minimum subarray sum
            cursumMin = Math.min(cursumMin + nums[i], nums[i]);
            minsum = Math.min(minsum, cursumMin);
        }
        
        // If all numbers are negative, return the max element (maxsum)
        if (maxsum < 0)
         {
            return maxsum;
        }
        
        // The result is the maximum between non-circular and circular subarray sum
        return Math.max(maxsum, totalsum - minsum);
    }
}
