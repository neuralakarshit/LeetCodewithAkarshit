

class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        
        int TotalSum = 0;
        
        int sum = 0;
        // Variable to store pivot index, initialized to -1 (meaning no pivot found)
        int idx = -1;

        for(int i = 0; i < nums.length; i++)
        {
            TotalSum += nums[i];
        }

        
        for(int i = 0; i < nums.length; i++)
        {
            // Check if the left sum equals the right sum
            if(sum == (TotalSum - nums[i] - sum))
            {
                idx = i; // Found pivot index
                break; // Exit loop once pivot is found
            }
            sum += nums[i]; // Update left sum for next iteration
        }

        // Return the pivot index (or -1 if no pivot was found)
        return idx;
    }
}
