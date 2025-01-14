/* note not correct approach!!
 When mid is 0, mid-1 would be -1, which is out of bounds.
When mid is arr.length - 1, mid+1 would be arr.length, which is out of bounds.
while(low<=high)
        {
            mid=low+((high-low)/2);  // to avoid integer overflow
            if(arr[mid-1]<=arr[mid] && arr[mid]>=arr[mid+1])
            {
                break;

            }
            else if(arr[mid]>arr[mid+1])
            {
               high=mid-1;
            }
            else if(arr[mid]<arr[mid+1])
            {
                low=mid+1;

            }*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    
    {

        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<high) //if we would have done low<=high,it will get stuck at highest point and keep on infinite loop
        {
            mid=low+((high-low)/2);  // to avoid integer overflow
           
            if(arr[mid]>arr[mid+1])
            {
               high=mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                low=mid+1;

            }



        }
        return high;
               
    }
}