class Solution {
    public int longestSubarray(int[] nums) 
    {

        int ans=0;
        int cur=0;
        int prev=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                cur++;
            }
            else
            {
                ans=Math.max(ans,(cur+prev));
                prev=cur;
                cur=0;
            }
        }
        ans=Math.max(ans,(cur+prev));
        if(ans==nums.length)  //exception case where all  1's so no 0 is skipped in between
        {
            ans=ans-1;
        }
        return ans;
        
    }
}