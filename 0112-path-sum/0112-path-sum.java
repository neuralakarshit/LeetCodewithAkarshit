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

        int cursum=0;
        return checkSum(root,targetSum,cursum);
        
    }

    boolean checkSum(TreeNode root,int targetSum,int cursum)
    {
        if(root==null)
        {
            return false;
        }
        int newSum=cursum + root.val;
        if(root.left==null && root.right==null)
        {
            if(newSum==targetSum)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        return (checkSum(root.left,targetSum,newSum)||checkSum(root.right,targetSum,newSum));
    }
}