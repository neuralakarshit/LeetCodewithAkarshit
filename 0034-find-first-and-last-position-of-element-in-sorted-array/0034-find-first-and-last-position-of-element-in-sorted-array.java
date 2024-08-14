class Solution {
    public int[] searchRange(int[] nums, int target) 
    
    {
        int ans[]=new int[2];
         ans[0]=-1;
         ans[1]=-1;
     

        if(nums.length==0)
        {
            return ans;
        }
       

        int l=0;
        int h=nums.length-1;

        while(l<=h)
        {
           int mid=l+(h-l)/2;

           if(nums[mid]==target)
           {
            ans[0]=mid; // find first occ. of element on left and keep on h=mid-1
            h=mid-1;
           }
           else if(target>nums[mid])
           {
            l=mid+1;
           }
           else
           {
            h=mid-1;
           }
        }

        if (ans[0] == -1) //left most elem doesn't exist and will not be present in array too
        {    
            return ans;
        }


        l=ans[0];    // if found and earch right side same elem 
        h=nums.length-1;

        while(l<=h)
        {

           int mid=l+(h-l)/2;

           if(nums[mid]==target)
           {
            ans[1]=mid;
            l=mid+1;
           }
           else if(target>nums[mid])
           {
            l=mid+1;
           }
           else
           {
            h=mid-1;
           }
        }
        return ans;
    }
}