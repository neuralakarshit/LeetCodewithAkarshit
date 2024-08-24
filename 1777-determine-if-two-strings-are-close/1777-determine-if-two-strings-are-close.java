class Solution
 {
    public boolean closeStrings(String word1, String word2) 
    {
             if(word1.length()!=word2.length())
             {
                return false;
             }

                HashMap<Character,Integer> w1=new HashMap<>();
                HashMap<Character,Integer> w2=new HashMap<>();

                for(int i=0;i<word1.length();i++)
                { 
                    char c=word1.charAt(i);
                    if(w1.containsKey(c))
                    {
                        w1.put(c,w1.get(c)+1);
                    }
                    else
                    {
                        w1.put(c,1);
                    }
                }
                
                for(int i=0;i<word2.length();i++)
                { 
                    char c=word2.charAt(i);
                    if(w2.containsKey(c))
                    {
                        w2.put(c,w2.get(c)+1);
                    }
                    else
                    {
                        w2.put(c,1);
                    }
                }

                if(!w1.keySet().equals(w2.keySet()))
                {
                    return false;
                }


                    // Step 4: Create frequency of frequencies maps
               Map<Integer, Integer> freqOfFreqw1 = new HashMap<>();
               Map<Integer, Integer> freqOfFreqw2 = new HashMap<>();

                    // Populate freqOfFreqMap1
                for(int freq : w1.values()) 
                {
                    freqOfFreqw1.put(freq, freqOfFreqw1.getOrDefault(freq, 0) + 1);
                }

                    // Populate freqOfFreqMap2
                for(int freq : w2.values()) 
                {
                    freqOfFreqw2.put(freq, freqOfFreqw2.getOrDefault(freq, 0) + 1);
                }

                return freqOfFreqw1.equals(freqOfFreqw2);
        
    }
}