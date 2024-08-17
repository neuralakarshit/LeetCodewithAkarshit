class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        // Initialize the left and right pointers for the sliding window
        int left = 0;
        int right = 0;
        
        // To keep track of the number of zeros in the current window
        int zeros = 0;
        
        // Variables to store the current window length and the maximum length found
        int len = 0;
        int max = 0;

        // Iterate through the array using the right pointer
        while (right < nums.length)
        {
            // If the current element is 0, increment the zero count
            if (nums[right] == 0)
            {
                zeros++;
            }
            
            // If the number of zeros exceeds k, shrink the window from the left
            while (zeros > k)
            {
                if (nums[left] == 0)
                {
                    zeros--; // Reduce the zero count as we're moving the left pointer
                }
                left++; // Move the left pointer to the right to shrink the window
            }
            
            // If the number of zeros is within the allowed limit (k)
            if (zeros <= k)
            {
                // Calculate the current window length
                len = right - left + 1;
                // Update the maximum length found so far
                max = Math.max(max, len);
            }
            
            // Move the right pointer to expand the window
            right++;
        }
        
        // Return the maximum length of consecutive 1s found after flipping at most k zeros
        return max;
    }
}
