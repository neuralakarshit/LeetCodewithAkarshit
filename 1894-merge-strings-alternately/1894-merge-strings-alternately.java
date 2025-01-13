class Solution {
    public String mergeAlternately(String word1, String word2)
    
    
    {
        String merge="";

        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            merge += word1.charAt(i);
            i++;
            merge += word2.charAt(j);
            j++;
        }

        while (i < word1.length()) {
            merge += word1.charAt(i);
            i++;
        }

        while (j < word2.length()) {
            merge += word2.charAt(j);
            j++;
        }

        return merge;
    }
}