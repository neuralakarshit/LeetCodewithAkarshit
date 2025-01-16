



/*Note-->Regular Expression [^A-Za-z0-9]: This regex matches any character that is not a letter (both uppercase and lowercase) or a digit. Thus, it effectively removes spaces, punctuation, and other special characters.
 */


 class Solution {
    public boolean isPalindrome(String s) 
    {


        String s1=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int l=s1.length();
        boolean f=false;

        if(s1.length()==1||s1.equals(""))
        {
            return true;
        }

        int i=0;
        while(i<=l/2)
        {
            if(s1.charAt(i)==s1.charAt(l-i-1))
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