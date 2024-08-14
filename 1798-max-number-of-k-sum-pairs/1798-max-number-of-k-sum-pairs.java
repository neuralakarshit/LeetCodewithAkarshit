class Solution {
    public int maxOperations(int[] nums, int k) 
    {
        if(nums.length<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int c=0;
        while(i<j)
        {
            if((nums[i]+nums[j])==k)
            {
                c++;
                i++;
                j--;
            }
            else if((nums[i]+nums[j])<k)
            {
                i++;
            }
            else if(nums[i]+nums[j]>k)
            {
                j--;
            }
        }
        return c;


        
    }
}