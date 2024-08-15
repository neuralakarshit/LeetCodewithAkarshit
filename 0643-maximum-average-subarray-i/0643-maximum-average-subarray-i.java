/* NOTE--> DEFAULT APPROACH!
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        // Return the maximum average
        return (double) max / k;
    }
}

*/
class Solution {
    public double findMaxAverage(int[] nums, int k) 
    
    {
        int c=0;
        int max=nums[0];
        int sum=0;
    
      

        for(int i=0;i<nums.length;i++)
        {
                if(c<k)
                { 
                    sum=sum+nums[i]; // first four elements sum
                    c++;               
                    max=sum;    
                }
                else
                {                                
                    sum=sum+(nums[i]-nums[i-k]); // nextsum - subtracting 1,2,3..elem. frmstart
                    max=Math.max(max,sum);       
                }
        }
        return (double)max/k;
        
    }
}