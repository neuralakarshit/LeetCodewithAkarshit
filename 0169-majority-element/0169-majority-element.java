class Solution 
{
    public int majorityElement(int[] nums) 
    {
        Integer el=null;
        int c=0;

        for(int i=0;i<nums.length;i++)
        {
            if(c==0)
            {
                el=nums[i];
                c=1;
            }
            else if(nums[i]==el)
            {
                c++;

            }
            else
            {
                c--;
            }

        }
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(el==nums[i])
            {
               ans++;
            }

        }
           if(ans>nums.length/2)
            {
                return el;
            }
            else
            {
                return -1;
            }
        
    }
}