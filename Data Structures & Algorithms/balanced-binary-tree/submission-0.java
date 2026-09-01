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
    public boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        return balanced;
    }
    public int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int lst = height(root.left);
        int rst = height(root.right);
        if(Math.abs(lst-rst) > 1){
            balanced = false;
        }
        return Math.max(lst, rst)+1;
    }
}
