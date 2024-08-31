class Solution {
    public int missingNumber(int[] nums)
    
     {

        int n= nums.length;
        int TotalSum=n*(n+1)/2;
        int actualSum=0;
        boolean c=false;
        int missingNum=-1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                c=true;   // to counter number 0 presence!
            }

        }

        if(c)
        {
            for(int i=0;i<n;i++)
            {
                actualSum+=nums[i];  
            }
            missingNum=TotalSum-actualSum;
            
        }
        else
        {
            missingNum=0;
        }
        return missingNum;
        
    }
}