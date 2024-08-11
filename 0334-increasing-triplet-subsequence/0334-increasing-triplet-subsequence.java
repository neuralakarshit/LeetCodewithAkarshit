class Solution {
    public boolean increasingTriplet(int[] nums) 
    {
        boolean f=false;
        int smallest=Integer.MAX_VALUE;
        int middle=Integer.MAX_VALUE;
        if(nums.length<3)
        {
            return false;
        }
        else
        { 
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]<=smallest)
           {
            smallest=nums[i];
           }
           else if(nums[i]<=middle)
           {
            middle=nums[i];
           }
           else
           {
            f=true;
           }
        }
        return f;
        }
    }
}