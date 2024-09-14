class Solution
 {
    public int subarraySum(int[] nums, int k) //equals k<< strict constraint so slidng window not possible
    {

        // HashMap to store the frequency of prefix sums
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // To handle the case where a subarray sum equals k from the beginning
        
        int currentSum = 0;
        int count = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            // Check if (currentSum - k) exists in the map
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);  // Add the frequency of the required prefix sum
            }
            
            // Update the map with the current sum
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}