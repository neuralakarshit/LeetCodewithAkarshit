class Solution {
    public int maxProfit(int[] prices)
    
     {

        int buy=prices[0];
        int ans=0;
        int profit=0;
        
        for(int i=1;i<prices.length;i++)
        {
           profit=prices[i]-buy;
           ans=Math.max(profit,ans);
           buy=Math.min(buy,prices[i]);

        }
        return ans;
    }
}