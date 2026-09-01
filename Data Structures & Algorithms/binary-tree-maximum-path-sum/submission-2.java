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
    public int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        calculateMaxSum(root);
        return maxSum;
    }
    public int calculateMaxSum(TreeNode root){
        if(root == null){
            return 0;
        }
        int lmax = Math.max(0, calculateMaxSum(root.left));
        int rmax = Math.max(0, calculateMaxSum(root.right));

        int currentMax = root.val + lmax + rmax;
        maxSum = Math.max(maxSum, currentMax);

        return root.val + Math.max(lmax, rmax);
    }
}
