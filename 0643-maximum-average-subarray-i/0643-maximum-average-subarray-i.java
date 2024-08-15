class Solution {
    public double findMaxAverage(int[] nums, int k) 
    
    {
        int c=0;
        int max=nums[0];
        int sum=0;
    
      

        for(int i=0;i<nums.length;i++)
        {
                if(c<k)
                { 
                    sum=sum+nums[i];
                    c++;               
                    max=sum;    
                }
                else
                {
                    sum=sum+(nums[i]-nums[i-k]);
                    max=Math.max(max,sum);       
                }
        }
        return (double)max/k;
        
    }
}