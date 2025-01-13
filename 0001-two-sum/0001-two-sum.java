/* Note for future-
if i would have put() after  loop -->  

code has a logical error in the handling of the complement check within the loop. Specifically, you are putting the current number and its index into the map before checking if the complement exists. This causes the code to incorrectly match the number with itself if the target is twice that number.

Additionally, the break statement is used, which stops the loop prematurely if a solution is found. Instead, you should first check if the complement exists before inserting the current number into the map.


 
    public int[] twoSum(int[] nums, int target) 
    
    {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],i);                
           int complement=target-nums[i];
            if(map.containsKey(complement))
            {
               ans[0]=i;
               ans[1]=map.get(complement);
               break;

            }
                 

        }
        return ans;

*/

import java.util.*;
class Solution 
{
    
    public int[] twoSum(int[] nums, int target) 
    
    {
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
                           
           int complement=target-nums[i];
            if(map.containsKey(complement))
            {
               ans[0]=map.get(complement);
               ans[1]=i;
               break ;

            }
            map.put(nums[i],i); 
                 

        }
       return ans;


    }

}

