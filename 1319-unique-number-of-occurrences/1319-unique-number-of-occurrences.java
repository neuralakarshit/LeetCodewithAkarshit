import java.util.HashMap;
import java.util.HashSet;

class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int i = 0; i < arr.length; i++) 
        {
            int num = arr[i];
            
            // --> "OR"--> map.put(arr[i],map.getOrDefault(arr[i],0)+1) 


            // Check if the element is already in the map
            if (map.containsKey(num)) 
            {
                // Increment the count if the element is already present
                map.put(num, map.get(num) + 1);
            } 
            else 
            {
                // Add the element to the map with a count of 1
                map.put(num, 1);
            }
        }


        // Create a HashSet to store unique frequencies
        HashSet<Integer> set = new HashSet<>();

        // Add all frequency values from the map to the set
        for (var freq : map.values()) 
        {
            set.add(freq);   // set will onlt store unique freq.
        }
        
        // Check if the number of unique frequencies is equal to the number of unique elements in the map
        // If true, all frequencies are unique
        return map.size() == set.size();
    }
}
