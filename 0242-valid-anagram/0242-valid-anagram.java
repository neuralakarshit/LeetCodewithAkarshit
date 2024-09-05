class Solution 
{
    public boolean isAnagram(String s, String t) 
    {

         if (s.length() != t.length()) 
         {
            return false;  
            
        }

        HashMap<Character, Integer> countMap = new HashMap<>();
       
        for (char c : s.toCharArray()) 
        {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Subtract frequencies using characters from the second string
        for (char c : t.toCharArray()) 
        {
            if (!countMap.containsKey(c)) 
            {
                return false;  // If character in `t` not found in `s`
            }
            countMap.put(c, countMap.get(c) - 1);

            if (countMap.get(c) == 0) 
            {
                countMap.remove(c);  // Remove if count reaches 0
            }
        }


        return countMap.isEmpty();
        
    }
}