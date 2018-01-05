class Solution {


    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stk = new Stack<TreeNode>();
        int count=0;
        TreeNode current = root;
        while( (current!=null) || (!stk.empty()) ) {
            if(current!=null)
            {
                stk.push(current);
                current=current.left;

            }

            else{
                current=stk.pop();
                count++;
                if(count==k)
                    return current.val;
                current=current.right;

            }

        }

       return 0;
    }
}
