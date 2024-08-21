class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int TotalSum=0;
        int sum=0;
        int idx=-1;
        for(int i=0;i<nums.length;i++)
        {
           TotalSum+=nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
             if(sum==(TotalSum-nums[i]-sum))
             {
                 idx=i;
                 break;
             }
             sum+=nums[i];
        }
        return idx;
        
    }
}