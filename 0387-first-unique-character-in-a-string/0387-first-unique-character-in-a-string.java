
import java.util.*;
class Solution 
{
    public int firstUniqChar(String s) 
    
    {
       int idx=-1;
       LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

      for (int i = 0; i < s.length(); i++) 
      {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
      }
        
        // Second pass: find the first unique character
        for (int i = 0; i < s.length(); i++)
         {
            if (map.get(s.charAt(i)) == 1) 
            {
                idx= i;
                break;
            }
            
         }   
         return idx;  
              
    }
}