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



 /*                                        ----> Note<----


 In the provided solution, you're passing the string S by value, which means the changes to S inside the checksimilar method won't reflect outside of the method. This is because Java is pass-by-value, and when you pass a string, you're passing a copy of the reference, not the actual reference. So, the modifications in the recursive calls do not propagate back to the original string.

To resolve this, use a StringBuilder to accumulate the leaf values, or better yet, use a List<Integer> to collect the leaf nodes for comparison.

*/

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2)
    {

        StringBuilder S1 = new StringBuilder();
        StringBuilder S2 = new StringBuilder();
        
        checksimilar(root1, S1);
        checksimilar(root2, S2);
        
        // Compare the two StringBuilders
        return S1.toString().equals(S2.toString());
    }

        // Helper method to collect leaf nodes using StringBuilder
    public void checksimilar(TreeNode root, StringBuilder S) 
    {
        if (root == null) 
        {
            return;
        }
        
        // If it's a leaf node, append its value to StringBuilder
        if (root.left == null && root.right == null) 
        {
            S.append(root.val).append("_");
        }
        
        // Recurse through left and right children
        checksimilar(root.left, S);
        checksimilar(root.right, S);
    }
}
