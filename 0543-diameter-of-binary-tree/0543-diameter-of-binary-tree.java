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

    int diameter=0; // need to globally declare 
    public int diameterOfBinaryTree(TreeNode root) 
    {
       longestPath(root);
       return diameter;
        
    }

    public int longestPath(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=longestPath(root.left);
        int rh=longestPath(root.right);
        diameter=Math.max(diameter,lh+rh);

        return Math.max(lh,rh)+1;

    }
}