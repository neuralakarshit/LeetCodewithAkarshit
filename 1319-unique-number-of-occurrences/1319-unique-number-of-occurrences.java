class Solution
 {
    public boolean uniqueOccurrences(int[] arr) 
    {

        HashMap <Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            // --> "OR"--> map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
            int num = arr[i];
            // Check if the element is already in the map
            if (map.containsKey(num)) 
            {
                // Increment the count if the element is already present
                map.put(num,map.get(num) + 1);
            } 
            else 
            {
                // Add the element to the map with a count of 1
                map.put(num, 1);
            }
        }

        HashSet <Integer> set=new HashSet<>();

        for(var i:map.values())
        {
            set.add(i);
        }
        
        if(map.size()==set.size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}