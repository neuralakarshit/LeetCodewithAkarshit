class Solution {
    public int removeElement(int[] nums, int val) 
    
      { 
        int l=nums.length;
        int c=0;
        int k=-1;
        int j=0;
        int[]arr=new int[l];
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
            if(nums[i]!=-1&&nums[i]!=val)
            {
                nums[j]=nums[i];
                j++;
            }
            else
            {
                nums[j]=-1;
                j++;
            }
           
          }
        
          return c;
      }
}

   