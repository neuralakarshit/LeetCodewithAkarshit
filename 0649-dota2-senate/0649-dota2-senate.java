class Solution 
{
    public String predictPartyVictory(String s) 
    {

        int n=s.length();

        Queue<Integer> R=new LinkedList<>();
        Queue<Integer> D=new LinkedList<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(c=='R')
            {
                R.offer(i);
            }
            else if(c=='D')
            {
                D.offer(i);
            }
        }

        if(R.size()==0)
        {
            return "Dire";
        }
        else if(D.size()==0)
        {
            return "Radiant";
        }
        
        int i=0;
        int j=0;
        while(!R.isEmpty() && !D.isEmpty())
        {
            i=R.poll();
            j=D.poll();

            if(i<j)
            {
                R.offer(i+n);
            }
            else
            {
                D.offer(j+n);
            }

        }

        return R.isEmpty()?"Dire":"Radiant";
        
    }
}