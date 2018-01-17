/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return treeNodeHelper(preorder,inorder,0, (preorder.length)-1,0,(inorder.length)-1);
    }

    private TreeNode treeNodeHelper(int[] preorder, int inorder[], int preStart, int preEnd, int inStart, int inEnd)
    { if(preStart-preEnd==0)
      {
        TreeNode root = new TreeNode(prerrder[preStart]);
        TreeNode root.left = null;
        TreeNode root.right = null;
        return root;
      }
      int leftPreStart, rightPreStart, leftPreEnd, rightPreEnd;
      int leftInStart, rightInStart, leftInEnd, rightInEnd;
      TreeNode root = new TreeNode(prerorder[preStart]);
      for(i=0;i<preorder.length;i++)
      {
        if(inorder[i]==preorder[preStart])
              {
                leftInStart = inStart;
                if(i>0)
                leftInEnd= i-1;
                else
                leftInEnd= i;
                leftPreStart = preStart+1;
                leftPreEnd = (leftInStart - leftInEnd) +1;
                if(i< (preorder.length) -1 )
                rightInStart = i+1;
                else
                rightInStart = i;
                rightInEnd= inEnd;
                rightPreStart = leftPreEnd+1;
                rightPreEnd = preEnd;
              }

      }

      TreeNode root.left = treeNodeHelper(preorder,inorder,leftPreStart,leftPreEnd,leftInStart,leftInEnd);
      TreeNode root.right = treeNodeHelper(preorder,inorder,rightPreStart,rightPreEnd,rightInStart,rightInEnd);
      return root;

    }
}
