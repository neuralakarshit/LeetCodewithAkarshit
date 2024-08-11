class Solution 
{
    public boolean canJump(int[] nums) 
    {
        int farthest = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > farthest) {
                return false; // If current index is beyond the farthest reachable index
            }
            farthest = Math.max(farthest, i + nums[i]); // Update farthest reachable index
            if (farthest >= n - 1) {
                return true; 
            }
        }
        
        return false;
    }
}