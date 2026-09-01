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
    public int ans = -1;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }
    public int height(TreeNode root){
        if(root == null){
            return -1;
        }
        int lans = height(root.left);
        int rans = height(root.right);
        ans = Math.max(ans, lans+rans+2);
        return Math.max(lans,rans)+1;
    }
}
