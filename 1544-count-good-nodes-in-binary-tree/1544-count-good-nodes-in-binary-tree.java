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
    public int goodNodes(TreeNode root)
    {

        int curmax=Integer.MIN_VALUE; // cause for first time root always good !!
        return helper(root,curmax);
        
    }

    public int helper(TreeNode root,int curmax)
    {
        if(root==null)
        {
            return 0;
        }

        int rootAnswer=0;

        if(root.val>=curmax)
        {
            rootAnswer=1;
            curmax=root.val;
        }

        int left=helper(root.left,curmax);
        int right=helper(root.right,curmax);
        
        return left + right + rootAnswer;
    }


}