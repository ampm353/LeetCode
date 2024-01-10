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
 /**
  * 전위 순회(Preorder Traversal) 방식을 떠올려서 작성한 풀이
 class Solution {
    public int maxDepth(TreeNode root) {
        
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
  */
/** 아래는 Recursion(재귀) 를 활용한 방법
 * (Solutions 을 보고 참고함)
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left,right) + 1;
    }
}
