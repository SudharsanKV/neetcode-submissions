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
    private int count;
    private int ans;
    public int kthSmallest(TreeNode root, int k) {
        int count = 0;
        smallest(root, k);
        return ans;
    }
    public void smallest(TreeNode root, int k){
        if(root == null){
            return;
        }
        smallest(root.left, k);
        count++;
        if(count == k){
            ans = root.val;
            return;
        }
        smallest(root.right, k);
        return;
    }
}
