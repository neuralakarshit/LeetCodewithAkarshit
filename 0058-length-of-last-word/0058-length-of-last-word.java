class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        if(s.length()==0)
        {
           return 0;
        }

        String[] s1=s.trim().split(" ");

        String lastword=s1[s1.length-1];

        return lastword.length();

        
        
    }
}