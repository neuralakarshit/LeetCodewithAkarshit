class Solution {
    public int findPeakElement(int[] nums) 
    {

        int l=0;
        int h=nums.length-1;
        int mid =0;

        while(l<h)
        {
             mid=l+(h-l)/2;
            if(nums[mid]<nums[mid+1])
            {
                l=mid+1;
            }
            else if(nums[mid]>nums[mid+1])
            {
                h=mid;
            }
        }
        return h ;
        
    }
}