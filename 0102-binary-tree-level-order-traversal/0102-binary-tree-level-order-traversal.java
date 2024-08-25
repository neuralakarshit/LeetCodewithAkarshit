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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        {
            return ans;
        }
        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);
        

        while(!q.isEmpty())
        {
            int levelsize=q.size();
            List<Integer> currentlevel=new ArrayList<>();
            for(int i=0;i<levelsize;i++)
            {
                TreeNode current=q.poll();
                if(current.left!=null)
                {
                    q.offer(current.left);
                }
                if(current.right!=null)
                {
                    q.offer(current.right);
                }
                
               currentlevel.add(current.val);
            }
            ans.add(currentlevel);
        }
        return ans;

        
    }
}