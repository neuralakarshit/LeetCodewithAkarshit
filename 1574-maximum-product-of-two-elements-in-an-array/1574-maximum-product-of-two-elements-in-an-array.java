
class Solution {
    public int maxProduct(int[] nums)
    
    {
        int max=-1;
        int smax=-1;

        for(int i=0;i<nums.length;i++)
        {
           if(max<nums[i])
           {
            smax=max;
            max=nums[i];
           }
           else if(nums[i]>smax)
           {
            smax=nums[i];
           }
        }

        int result=(smax-1)*(max-1);
        return result;
        
    }
}