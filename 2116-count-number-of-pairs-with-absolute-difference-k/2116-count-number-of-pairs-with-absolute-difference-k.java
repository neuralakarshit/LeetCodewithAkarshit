class Solution 
{
    public int countKDifference(int[] nums, int k) 
    {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

            // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) 
        {
            int num = nums[i];
             map.put(num, map.getOrDefault(num, 0) + 1);

            // Check if (num - k) exists in the map
            if (map.containsKey(num - k)) 
            {
                count += map.get(num - k);
            }
            // Check if (num + k) exists in the map
            if (map.containsKey(num + k)) 
            {
                count += map.get(num + k);
            }

            // Update the map with the count of the current number
           // map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

        
}
