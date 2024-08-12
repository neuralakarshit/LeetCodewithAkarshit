/*compare for i to i-1 so won't go index out                                             of bound at last*/

class Solution 
{
    public int compress(char[] chars) 
    {
       if (chars == null || chars.length == 0) 
       {
            return 0;
       }

        String s = "";
        int count = 1;

        for (int i = 1; i < chars.length; i++) 
        {
            if (chars[i] == chars[i - 1]) 
            {
                count++;
            } 
            else 
            {
                s += chars[i - 1];
                if (count > 1)   // if c=1 we just have to add character(given) else add
                {
                    s += count;
                }
                count = 1; // Reset count for new character
            }
        }

        // Handle the last character sequence -->either same as prev or new char at last!
        s += chars[chars.length - 1];
        if (count > 1) 
        {
            s += count;
        }

        // Update chars array with the compressed result
        for (int i = 0; i < s.length(); i++) 
        {
            chars[i] = s.charAt(i);
        }

        // Return the length of the compressed string
        return s.length();

        
    }
}