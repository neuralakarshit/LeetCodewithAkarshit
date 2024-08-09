class Solution
 {
    public int[] sortedSquares(int[] nums) 
    
    {
       int l=nums.length;
       int arr[]=new int[l];

       int i=0;
       int j=nums.length-1;
       int k=nums.length-1;

       while (i<=j)
       {
         int sq1=nums[i]*nums[i];
         int sq2=nums[j]*nums[j];

         if(sq1<=sq2)
         {
            arr[k]=sq2;
             k--;
             j--;
         }
         else
         {
            arr[k]=sq1;
             k--;
             i++;
         }
        }

          return arr;

    }
}