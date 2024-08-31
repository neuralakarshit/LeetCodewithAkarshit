import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        
        ArrayList<Boolean> list = new ArrayList<>();
        //Arrays.fill(result,false);
        int max=candies[0];
        for(int i=1;i<candies.length;i++)
        {
           max=Math.max(max,candies[i]);

        }
         for(int i=0;i<candies.length;i++)
        {
           if((candies[i]+extraCandies)>=max)
           {
            list.add(i,true);
           }
           else
           {
            list.add(i,false);
           }

        }
        return list;




    }
}