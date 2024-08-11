/*The main logic of the "Bulb Switcher" problem is:

The number of bulbs that remain on is equal to the number of perfect squares less than or equal to n. */


class Solution {
    public int bulbSwitch(int n) 
    {

      int c=0;
      int i=1;
      while(i*i<=n)
      {
        c++;
        i++;
      }

      return c;


    }
}