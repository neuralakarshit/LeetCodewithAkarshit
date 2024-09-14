class Solution 
{
    public int maximizeSum(int[] nums, int k)
    {
        // Sort the array to get the largest element
        Arrays.sort(nums);
        
        // Get the largest element
        int largest = nums[nums.length - 1];
        int maxSum = 0;
        
        // Add the largest element k times, increasing it by 1 each time
        for (int i = 0; i < k; i++) 
        {
            maxSum += largest;
            largest++;  // Increase the value for the next selection
        }
        
        return maxSum;
        
    }
}