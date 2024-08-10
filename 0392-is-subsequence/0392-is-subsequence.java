class Solution {
    public boolean isSubsequence(String s, String t) 
    {
   
        if (s == null || t == null) 
        {
            return false;
        }

        if (s.isEmpty()) 
        {
            return true; // An empty string is a subsequence of any string
        }

        int sIndex = 0;
        int tIndex = 0;

        
        while (sIndex < s.length() && tIndex < t.length()) 
        {
            
            if (s.charAt(sIndex) == t.charAt(tIndex)) 
            {
                sIndex++;
            }
            // Always move the pointer in t
            tIndex++;
        }

        // If sIndex reached the length of s, it means all characters in s were found in t
        return sIndex == s.length();
    }
    
}    