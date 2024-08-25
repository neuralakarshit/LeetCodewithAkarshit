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


 /*
class Solution  
{
    public List<Integer> preorderTraversal(TreeNode root) 
    {
       List<Integer> l=new ArrayList<Integer>();
       preorder(root,l);
       return l;
        
    }
    
    public void preorder(TreeNode root,List<Integer> l)
    {
        if (root==null)
        {
           return ;
        }
        l.add(root.val);
        preorder(root.left,l);
        preorder(root.right,l);

    }
}
*/

class Solution  
{
    public List<Integer> preorderTraversal(TreeNode root) 
    {
       List<Integer> preorder=new ArrayList<Integer>();
        if(root==null)
        {
            return preorder;
        }
    
       Stack<TreeNode> s=new Stack<>();

       s.push(root);

       while(!s.isEmpty())
       {
        root=s.pop();
        preorder.add(root.val);

        if(root.right!=null)
        {
            s.push(root.right);
        }

        if(root.left!=null)
        {
            s.push(root.left);
        }

       }  

       return preorder;   
    }
    
   
}