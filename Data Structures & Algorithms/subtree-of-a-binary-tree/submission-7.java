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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        if(isSameTree(root, subRoot)){
            return true;
        } 
        boolean lans = isSubtree(root.left, subRoot);
        boolean rans = isSubtree(root.right, subRoot);
           
        return lans || rans;
    }

    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null || p.val!=q.val){
            return false;
        }
        boolean lans = isSameTree(p.left, q.left);
        boolean rans = isSameTree(p.right, q.right);
        return lans && rans;
    }
}
