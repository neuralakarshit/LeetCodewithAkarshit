// Note--> s1.split("\\s+"); \\s+(to handle multiple spaces correctly)
// eg.a good   example--> here after good 2 spaces or present
// so //s+--> one more spaces split each word of string and just place words in string array


class Solution {
    public String reverseWords(String s) 
    {
        String s1=s.trim();
        String[] words = s1.split("\\s+");
        
        StringBuilder reversed = new StringBuilder();
        
        
        for (int i = words.length - 1; i >= 0; i--) 
        {
            reversed.append(words[i]);
            
            // Append a space between words except for the last word
            if (i > 0) {
                reversed.append(" ");
            }
        }

        
        // Convert StringBuilder to String 
        return reversed.toString();
    }
}