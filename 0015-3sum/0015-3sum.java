import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
       List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int threeSum=0;

        for(int k=0;k<nums.length-2;k++)
        {
              if(k>0 && nums[k]==nums[k-1])
              {
                continue;
              }

              int i=k+1;
              int j=nums.length-1;

              while(i<j)
              {

                 threeSum=nums[i]+nums[j]+nums[k];

                 if(threeSum>0)
                 {
                    j--;
                 }
                 else if(threeSum<0)
                 {
                    i++;
                 }
                 else
                 {

                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));

                    // Skip duplicate elements for `i`
                    while (i < j && nums[i] == nums[i + 1]) {
                        i++;
                    }
                    // Skip duplicate elements for `j`
                    while (i < j && nums[j] == nums[j - 1]) {
                        j--;
                    }


                    i++;  // here now again inc. and will skip duplicate element
                    j--;

                     
                 }


              }

        }
        return result;
        
    }
}