class Solution 
{
    public void sortColors(int[] nums)
    {
        int idx=0;
        int start=0;
        int end=nums.length-1;

        while(idx<=end)
        {
            if(nums[idx]==0)
            {
                int temp=nums[start];
                nums[start]=nums[idx];
                nums[idx]=temp;

                start++;
                idx++;
            }
            else if(nums[idx]==2)
            {
                int temp=nums[end];
                nums[end]=nums[idx];
                nums[idx]=temp;

                end--;
        //here we wont inc idx++ at first cause don't know whch elem coming back at nums[idx] post swap 
            }
            else
            {
                // if nums[idx]==1,just skip i.e idx++
                idx++;
            }
        }


    }
}