class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        HashMap<Integer,Boolean> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],false);
        }

        for(var key:map.keySet())
         {
            if(map.containsKey(key-1)==false)
            {
               map.put(key,true);
            }
         }
        int max=0;
         for(int key:map.keySet())
         {
           int k=1;


           if(map.get(key)==true)
 // so only those starting seq. keys will check i.e constant and T.C = O(1)
 // otherwise if each key would be checked it would be O(n^2)
           {
                while(map.containsKey(key+k)==true)
                 {
                   k++;
                 }
           }

           max=Math.max(max,k);
         }
        return max;
    }
}