class Solution 
{
    public int titleToNumber(String columnTitle) 
    {
        char[]c=columnTitle.toCharArray();
        int result=0;
        for(int i=0;i<c.length;i++)
        {
            int num=c[i]-65+1;   
            result=result*26+num;

        }
        return result;
        
    }
}