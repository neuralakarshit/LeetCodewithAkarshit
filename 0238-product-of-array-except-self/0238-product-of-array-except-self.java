class Solution
 {
    public int[] productExceptSelf(int[] nums)
    {
        int res[]=new int[nums.length];

        int prefix=1;
        int postfix=1;
        int k;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                res[i]=1;
                prefix=nums[0];
            }
            else
            {
                res[i]=prefix;
                prefix=prefix*nums[i];
            }

        }   
        for(int i=nums.length-1;i>=0;i--)
        {
            if(i==nums.length-1)
            {
                res[i]=res[i];
                postfix=nums[nums.length-1];
            }
            else
            {
                k=postfix*res[i];
                res[i]=k;
                postfix=postfix*nums[i];
            }
              
        }
        return res;





    }
}