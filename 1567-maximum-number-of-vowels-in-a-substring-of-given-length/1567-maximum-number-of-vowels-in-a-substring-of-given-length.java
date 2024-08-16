class Solution 
{
    public int maxVowels(String s, int k) {
       
        char[] str = s.toCharArray();
        
        String vowel = "aeiou";
        
     
        int c = 0;
        
        int max = 0;

        // Count the number of vowels in the first window of size k
        for (int i = 0; i < k; i++) {
           
            if (vowel.indexOf(str[i]) != -1) {
                c++;
            }
        }
        // Initialize max with the vowel count of the first window
        max = c;
        
        // Start a pointer to the beginning of the sliding window
        int j = 0;

        for (int i = k; i < str.length; i++) { 
           
            if (vowel.indexOf(str[i]) != -1) {
                c++; 
            }
            // Check if the character exiting the window (at index j) is a vowel
            if (vowel.indexOf(str[j]) != -1) {
                c--; 
            }
            j++; // Move the start of the window forward

          
            max = Math.max(max, c);
        }
        
  
        return max;
    }
}
