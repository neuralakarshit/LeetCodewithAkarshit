class Solution 
{
    public List<Integer> intersection(int[][] nums) 
    {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++) 
            // nums[0].len not true here cause every row has different length!
            {
                map.put(nums[i][j],map.getOrDefault(nums[i][j],0)+1);

            }
        }
        return map.keySet().stream().filter(i->map.get(i)==n).sorted().collect(Collectors.toList());
    }
}