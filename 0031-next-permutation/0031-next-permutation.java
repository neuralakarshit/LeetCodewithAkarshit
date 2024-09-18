class Solution
 {

    private void swap(int[] nums, int i, int j)
     {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
     }


     private void reverse(int[] nums, int start, int end) 
     {
         for (int i = start, j = end; i < j; i++, j--) 
              {
                swap(nums, i, j);
              }
     }


    public void nextPermutation(int[] nums) 
    {
        int n = nums.length;
        
        int idx=-1;

        // Step 1: Find the first decreasing element from right to left
       for (int i = n - 2; i >= 0; i--) 
       {
           if (nums[i] < nums[i + 1]) 
            {
                idx=i;
                break;  // Found the first decreasing element
            }
       }

        // If no decreasing element was found, reverse the entire array
        if (idx == -1) 
        {
            reverse(nums, 0, n - 1);
            return;
        }


        // Find the smallest number greater than nums[i] from right to left
        for (int j = n - 1; j >=idx; j--) 
        {
            if (nums[j] > nums[idx])
            {
                // Swap them
                swap(nums,idx,j);
                break;
            }
        }

         // Step 3: Reverse the suffix (the elements after index i)
         reverse(nums, idx + 1, n - 1);


    }
}