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