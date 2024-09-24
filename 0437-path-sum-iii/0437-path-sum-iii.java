/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */


class Solution
 {
    int total = 0; 

    
    public int pathSum(TreeNode root, int sum) 
    {
        if (root == null) // Base case: if the root is null, there are no paths.
            return 0;

    // HashMap stores the prefix sums and how often they occur. We initialize it with 0 sum, seen once.
        HashMap<Long, Integer> hm = new HashMap<>(); // use Long for large node value to store sum
        hm.put(0L, 1);

       
        findPathSum(root, 0, sum, hm);  
        return total; 
    }

   
    private void findPathSum(TreeNode curr, long sum, int target, HashMap<Long, Integer> hm) 
    {
        if (curr == null) 
            return;

    
        sum += curr.val;

        // Check if there is a prefix sum that, when subtracted from the current sum, equals the target.
        // If it exists, add the frequency of that prefix sum to the total count.
        if(hm.containsKey(sum - target))
        {
            total += hm.get(sum - target);
        }

        // Add the current sum to the HashMap (prefix sum map) or update its frequency.
        hm.put(sum, hm.getOrDefault(sum, 0) + 1);

       
        findPathSum(curr.left, sum, target, hm);
        
        findPathSum(curr.right, sum, target, hm);

        // After the recursion, backtrack by removing the current sum from the HashMap.
        // This ensures that the prefix sum is only used for the current path.
        hm.put(sum, hm.get(sum) - 1);

        return; 
    }
}
