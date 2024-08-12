class Solution {
    public boolean isPalindrome(String s) 
    {


        String s1=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String modified="";
        boolean f=false;

        if(s1.length()==1||s1.equals(""))
        {
            return true;
        }
        
        
        for(int i=0;i<s1.length();i++)
        {
           if(!(s1.charAt(i)==' '))
           {
           modified+=s1.charAt(i);
           }
        }
        int l=modified.length();

        int i=0;
        while(i<l/2)
        {
            if(modified.charAt(i)==modified.charAt(l-i-1))
            {
                f=true;
            }
            else
            {
                f=false;
                break;
            }
            i++;
        }
        return f;
    }
}