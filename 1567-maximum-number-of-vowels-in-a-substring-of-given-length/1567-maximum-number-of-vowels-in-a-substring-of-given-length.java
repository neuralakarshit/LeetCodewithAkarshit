class Solution
 {
    public int maxVowels(String s, int k) 
    {
        char[]str=s.toCharArray();
        String vowel="aeiou";
        int c=0;
        int max=0;

        for(int i=0;i<k;i++)
        {
            if(vowel.indexOf(str[i])!=-1)
            {
                c++;
            }
        }
        max=c;
        int j=0;

        for(int i=k;i<str.length;i++)
        { 
            if(vowel.indexOf(str[i])!=-1)
            {
                c++;
            }
            if(vowel.indexOf(str[j])!=-1)
            {
                c--;
            }
            j++;
            max=Math.max(max,c);

        }
        return max;


    }
}