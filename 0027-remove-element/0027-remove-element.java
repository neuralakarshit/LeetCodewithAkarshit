class Solution {
    public int removeElement(int[] nums, int val) 
    
      { 
        int l=nums.length;
        int c=0;
        
        for(int i=0;i<nums.length;i++)
         {
             if(nums[i]!=val)
             {
               int temp=nums[i];
               nums[i]=-1;
               nums[c]=temp;
               c++;
             }
             
          }
          
          for(int i=0;i<nums.length;i++)
          {
            if(nums[i]==-1 || nums[i]==val)
            {
                nums[i]=-1;
               
            } 
          }
        
          return c;
      }
}

   