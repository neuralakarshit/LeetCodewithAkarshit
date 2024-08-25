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
    public boolean isBalanced(TreeNode root) 
    {
        if(root==null)
        {
            return true;
        }
        int height=Height(root);
        if(height!=-1)
        {
            return true;
        }
        return false;
        
    }

    int Height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        int left=Height(root.left);
        int right=Height(root.right);
         if(left==-1 || right==-1 || Math.abs(left-right)>1)
         {
            return -1;
         }

         return Math.max(left,right)+1;
    }
}