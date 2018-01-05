class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stk = new Stack<TreeNode>();
        TreeNode current = root;
        List<Integer> inOrder = new ArrayList<Integer>();
    while ((current!=null) || !stk.empty())
    {
        if(current==null)
        {
            current = stk.pop();
            inOrder.add(current.val);
            current = current.right;
        }
        else {
        stk.push(current);
        current=current.left;
        }

    }

    return inOrder;

    }
}
