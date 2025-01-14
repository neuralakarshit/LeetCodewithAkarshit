// time limit exceeds if(l<=h) keeps on checking forever cause not checking for target and no return statement!
class Solution {
    public int findMin(int[] nums) 
    {
        int l=0;
        int mid=0;
        int h=nums.length-1;

        while(l<h)
        {   
            mid=(l+h)/2;

           if(nums[mid]>nums[h])
           {
            l=mid+1;
           }
           else 
           {
            h=mid;
           }


        }
        return nums[l];       // or return nums[l]-->both will have same valueat last
        
    }
}