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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode curr = root;
        q.add(root);
        while(q.size() > 0){
            int size = q.size();
            List<Integer> levels = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node = q.remove();
                if(node!=null){
                    levels.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(levels.size() >0)
                ans.add(levels);
        }
        return ans;
    }
}
