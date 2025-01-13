import java.util.*;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) 
    
    {
        ArrayList<Integer> l=new ArrayList<>();
        int idx=num.length-1;
        
        int carry=0;
       ;
        while(k>0 || idx>=0)
        { 
            int val=0;
            if(idx>=0)
            {
              val=num[idx];
            }
            int d=k%10;
            int sum=d+val+carry;
            int ans=sum%10;
            l.add(ans);
            carry=sum/10;
           
            k=k/10;
            idx--;

        }
        if(carry>0)
        {
            l.add(carry);
        }
        Collections.reverse(l);
        return l;
        
    }
}