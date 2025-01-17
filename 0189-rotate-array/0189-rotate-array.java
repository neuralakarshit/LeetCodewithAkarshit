/*
Approach--->

First, we calculate the effective rotation steps k by taking the modulus of k with the size of the array n. This ensures that k is within the range [0, n).

We then reverse the entire array. This effectively moves the last k elements to the front.

After reversing, the first k elements in the array are the elements that should be at the end of the rotated array. So, we reverse only the first k elements to bring them to their correct positions.

Finally, we reverse the rest of the elements in the array after the first k elements. This brings the remaining elements back to their correct positions after rotation.

 */

class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        k=k%nums.length;
       int n=nums.length;
       
       reverse(nums,0,n-1);
       reverse(nums,0,k-1);
       reverse(nums,k,n-1);
        
    }
    public void reverse (int []nums,int l,int h)
    {

        while(l<h)
        {
            int temp=nums[l];
            nums[l]=nums[h];
            nums[h]=temp;
            l++;
            h--;
        }
    }
}