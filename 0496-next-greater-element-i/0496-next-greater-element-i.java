class Solution 
{
    public int[] nextGreaterElement(int[] nums1, int[] nums2)
    {

        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int res[]=new int[nums1.length];

        for(int i=0;i<nums2.length;i++)
        {
            while(!stack.isEmpty() && stack.peek()<nums2[i])
            {
            map.put(stack.pop(),nums2[i]);//places nxt greater elem for each

            }
            stack.push(nums2[i]);

        }

        for(int i:stack) // for left elem in stack for which no greater found
        {
            map.put(i,-1);
        }

        for(int i=0;i<nums1.length;i++)
        {
           res[i]=map.get(nums1[i]);
        }
        return res;
    }
}