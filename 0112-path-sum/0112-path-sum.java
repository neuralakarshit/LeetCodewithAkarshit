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
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {

        int curSum=0;
        return checkSum(root,targetSum,curSum);
        
    }

    boolean checkSum(TreeNode root,int targetSum,int curSum)
    {
        if(root==null)
        {
            return false;
        }
        curSum=curSum + root.val;
        if(root.left==null && root.right==null)
        {
            if(curSum==targetSum)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        return (checkSum(root.left,targetSum,curSum)||checkSum(root.right,targetSum,curSum));
    }
}