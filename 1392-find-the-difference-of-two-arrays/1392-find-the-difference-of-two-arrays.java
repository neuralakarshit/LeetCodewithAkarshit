import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

class Solution 
{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        

        // Add elements from nums1 to s1
        for (int i = 0; i < nums1.length; i++) 
        {
            s1.add(nums1[i]);
        }
           
        // Add elements from nums2 to s2
        for (int i = 0; i < nums2.length; i++) 
        {
            s2.add(nums2[i]);
        }

        // Find elements in s2 that are not in s1
        for (int num : s2) 
        {
            if (!s1.contains(num)) 
            {
                l2.add(num);
            }
        }
         
        // Find elements in s1 that are not in s2
        for (int num : s1) 
        {
            if (!s2.contains(num)) 
            {
                l1.add(num);
            }
        }

        
        answer.add(l1);
        answer.add(l2);

        return answer;
    }
}
