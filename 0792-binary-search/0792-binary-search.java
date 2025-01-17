


class Solution 
{
    public int search(int[] nums, int target) 
    {
        int l=0;
        int h=nums.length-1;
        int idx=-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;

            if(nums[mid]==target)
            {
                idx=mid;
                break;
            }
            else if(target>nums[mid])
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
       return idx;
    }
}