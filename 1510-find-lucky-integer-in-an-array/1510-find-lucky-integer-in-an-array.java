class Solution 
{
    public int findLucky(int[] arr) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int lucky=-1;

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==arr[i])
            {
                lucky=Math.max(lucky,arr[i]);

            }
        }
        return lucky;

        
    }
}