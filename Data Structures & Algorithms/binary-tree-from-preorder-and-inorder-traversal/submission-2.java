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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> inOrderMap = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            inOrderMap.put(inorder[i], i);
        }
        return constructTree(preorder, inOrderMap, 0, preorder.length-1, 0, inorder.length-1);
    }
    public TreeNode constructTree(int[] preorder, HashMap<Integer, Integer> inOrderMap, int psi, int pei, int isi, int iei){
        if(psi>pei || isi>iei){
            return null;
        }
        int idx = inOrderMap.get(preorder[psi]);
        TreeNode root = new TreeNode(preorder[psi]);
        root.left = constructTree(preorder, inOrderMap, psi+1, psi+idx-isi, isi, idx-1);
        root.right = constructTree(preorder, inOrderMap, psi+idx-isi+1, pei, idx+1, iei);
        return root;
    }
}
