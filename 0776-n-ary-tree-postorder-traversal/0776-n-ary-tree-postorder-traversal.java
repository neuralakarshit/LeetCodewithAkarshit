/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution 
{
    List<Integer> l=new ArrayList<Integer>();

    public List<Integer> postorder(Node root) 
    {
        if(root==null)
        {
            return l;
        }
        if(root.children==null)
        {
            l.add(root.val);
        }
        

        for(int i=0;i<root.children.size();i++)
        {
            postorder(root.children.get(i));
        }

         l.add(root.val);

        return l;


    }
}