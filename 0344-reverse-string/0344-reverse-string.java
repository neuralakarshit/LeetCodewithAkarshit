class Solution {
    public void reverseString(char[] s)
    { 

     int l=0;
     int h=s.length-1;

     while(l<h)
     {
        char x=s[l];
        s[l]=s[h];
        s[h]=x;

        l++;
        h--;
     }



    }
}