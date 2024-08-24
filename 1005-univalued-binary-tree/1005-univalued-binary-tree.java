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
    public boolean isUnivalTree(TreeNode root)
    {
        if(root==null)
        {
            return true;
        }
        if(UnivaluedTree(root,root.val)) 
        {
             return true;
        }
        return false;


    }
    public boolean UnivaluedTree(TreeNode root,int value)
    {
        
           if (root == null) 
              {
                return true;
              }

            if (root.val != value) 
              {
                return false;
              }

             // Capture the results of the recursive calls and return them
      return UnivaluedTree(root.left, value) && UnivaluedTree(root.right, value);

    }

}