class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    
    {
        int l1=nums1.length;
        int l2=nums2.length;
        int n=l1+l2;
        int[]arr=new int[n];
        int i=0;
        int j=0;
        int k=0;

        while(i<nums1.length && j<nums2.length)
        {
              if(nums1[i]<=nums2[j])
              {
                arr[k]=nums1[i];
                i++;
                k++;
              }
              else if(nums1[i]>nums2[j])
              {
                      
                arr[k]=nums2[j];
                j++;
                k++; 

              }

        }
         while(i<nums1.length)
        {
              
                arr[k]=nums1[i];
                i++;
                k++;
        }
        while(j<nums2.length)
        {
              
                arr[k]=nums2[j];
                j++;
                k++;
        }

        int l=0;
        int h=arr.length-1;
        int mid=(l+h)/2;
        double median=0;
        if(n%2!=0)
        {
          median = arr[mid];
        }
        else if(n%2==0)
        {
            median = (arr[mid]+arr[mid+1])/2.0;
        }
        return median;

    }
}