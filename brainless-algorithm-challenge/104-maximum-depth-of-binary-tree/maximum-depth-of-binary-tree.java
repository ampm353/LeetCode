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
    public int maxDepth(TreeNode root) {
        
        // 현재 값
        // 왼쪽 값
        // 오른쪽 값
        //
        if(root == null){
            return 0;
        }

        int maxLen = 0;

        int len = 0;
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        len++;

        while(!stack.empty()){
            
            TreeNode pre = stack.peek();
            pre.val = -101;

            if(pre.left != null
            && pre.left.val >= -100){
                stack.push(pre.left);

                len ++;
                continue;
            }

            if(pre.right != null
            && pre.right.val >= -100){
                stack.push(pre.right);
                len ++;
                continue;
            }

            stack.pop();
            maxLen = Math.max(maxLen, len);
            len --;
        }

        return maxLen;

    }
}